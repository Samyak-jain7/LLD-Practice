package Model;

public class User {

    String userId;
    String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }


    public String getUserName() {
        return userName;
    }
}
