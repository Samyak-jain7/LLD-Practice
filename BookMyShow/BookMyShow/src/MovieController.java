import Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> moviesInCity;
    List<Movie> allMovies;

    public static MovieController movieController;

    private MovieController() {
        moviesInCity = new HashMap<>();
        allMovies = new ArrayList<>();
    }


    public void addMovie(Movie movieName, City city) {
        allMovies.add(movieName);
        List<Movie> movies = moviesInCity.getOrDefault(city, new ArrayList<>());
        movies.add(movieName);
        moviesInCity.put(city, movies);
    }

    public Movie getMovieByName(String movieName) {

        for(Movie movie:allMovies) {
            if((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMovieByCity(City userCity) {
        return moviesInCity.get(userCity);
    }

    public static MovieController getInstance() {

        if(movieController==null) {
            synchronized (MovieController.class) {
                if(movieController==null) {
                    movieController = new MovieController();
                    return movieController;
                }
            }
        }
        return null;
    }
}
