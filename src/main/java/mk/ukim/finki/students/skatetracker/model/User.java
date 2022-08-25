package mk.ukim.finki.students.skatetracker.model;

import lombok.Getter;

@Getter
public class User {

    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = (long)(Math.random() * 1000);
    }

    public void changePassword(String password) {
        this.password = password;
    }
}
