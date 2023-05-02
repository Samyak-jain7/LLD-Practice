import Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class TheatreController {
    Map<City, List<Theatre>> theatresInCity;
    List<Theatre> allTheatre;

    public static TheatreController theatreController;

    private TheatreController() {
        theatresInCity = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {

        allTheatre.add(theatre);

        List<Theatre> theatres = theatresInCity.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        theatresInCity.put(city, theatres);
    }
    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
        //get all the theater of this city

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = theatresInCity.get(city);

        //filter the theatres which run this movie

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }

    public static TheatreController getInstance() {
        if(theatreController==null) {
            synchronized (TheatreController.class) {
                if(theatreController==null) {
                    theatreController = new TheatreController();
                    return theatreController;
                }
            }
        }
        return null;
    }
}
