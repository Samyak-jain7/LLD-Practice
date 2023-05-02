import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screenId;
    List<Seat> seatsList = new ArrayList<>();

    public List<Seat> getSeats() {
        return seatsList;
    }

    public void setScreenId(int id) {
        screenId = id;
    }

    public void setSeats(List<Seat> seats) {
        seatsList = seats;
    }
}
