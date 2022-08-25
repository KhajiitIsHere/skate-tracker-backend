package mk.ukim.finki.students.skatetracker.model.dto;

import lombok.Getter;

@Getter
public class UserDto {
    private String username;
    private Long userId;

    public UserDto(String username, Long userId) {
        this.username = username;
        this.userId = userId;
    }
}
