public class Movie {

    int movieId;
    String movieName;
    int movieDurationInMinutes;

    public void setMovieId(int id) {
        this.movieId = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDurationInMinutes = movieDuration;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieId() {
        return movieId;
    }
}
