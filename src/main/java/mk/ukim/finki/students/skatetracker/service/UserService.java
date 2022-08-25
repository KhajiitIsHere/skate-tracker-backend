package mk.ukim.finki.students.skatetracker.service;


import mk.ukim.finki.students.skatetracker.model.User;
import mk.ukim.finki.students.skatetracker.model.dto.UserDto;

public interface UserService {

    public UserDto register(String username, String password);

    public UserDto login(String username, String password);

    public void logoff(Long userId);

    public void changePassword(Long userId, String password);
}
