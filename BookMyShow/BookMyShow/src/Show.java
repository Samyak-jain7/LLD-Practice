import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int startTime;
    List<Integer> bookedSeatId = new ArrayList<>();

    public List<Integer> getBookedSeatIds() {
        return bookedSeatId;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setMovie(Movie movieName) {
        movie = movieName;
    }

    public void setShowStartTime(int startTime) {
        this.startTime = startTime;
    }
}
