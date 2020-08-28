package objects;

import java.util.Random;

public class User {
    public String userEmail;

    public User() {
        Random rd = new Random();
        userEmail = "testuser" + rd.nextInt(1000) + "@aol.com";
    }
}
