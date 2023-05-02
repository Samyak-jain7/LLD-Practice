import java.util.ArrayList;
import java.util.List;

public class Booking {
    Show show;
    List<Seat> bookedSeats = new ArrayList<>();
    Payment payment;

    public void setBookedSeats(List<Seat> myBookedSeats) {
        this.bookedSeats = myBookedSeats;
    }

    public void setShow(Show interestedShow) {
        this.show = interestedShow;
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
