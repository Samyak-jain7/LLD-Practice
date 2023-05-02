import Enums.SeatCategory;

public class Seat {
    int seatId;
    int row;
    SeatCategory category;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int id) {
        seatId = id;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        category = seatCategory;
    }
}
