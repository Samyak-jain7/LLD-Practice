import Enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    int theatreId;
    String address;
    City city;
    List<Screen> screenList = new ArrayList<>();
    List<Show> showList = new ArrayList<>();

    public void setTheatreId(int id) {
        this.theatreId = id;
    }

    public void setScreen(List<Screen> screen) {
        this.screenList = screen;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setShows(List<Show> shows) {
        this.showList = shows;

    }

    public List<Screen> getScreen() {
        return screenList;
    }

    public List<Show> getShows() {
        return showList;
    }
}
