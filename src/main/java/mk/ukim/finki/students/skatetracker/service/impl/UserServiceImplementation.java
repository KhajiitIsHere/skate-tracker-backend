package mk.ukim.finki.students.skatetracker.service.impl;

import mk.ukim.finki.students.skatetracker.exceptions.UsernameTakenException;
import mk.ukim.finki.students.skatetracker.initializer.InMemoryDataInitializer;
import mk.ukim.finki.students.skatetracker.model.dto.UserDto;
import mk.ukim.finki.students.skatetracker.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    private final InMemoryDataInitializer repo;

    public UserServiceImplementation(InMemoryDataInitializer repo) {
        this.repo = repo;
    }

    @Override
    public UserDto register(String username, String password) {
        if (!repo.registerUser(username, password))
            throw new UsernameTakenException();

        return repo.logInUser(username, password);
    }

    @Override
    public UserDto login(String username, String password) {
        return repo.logInUser(username, password);
    }

    @Override
    public void logoff(Long userId) {
        repo.logOffUser(userId);
    }

    @Override
    public void changePassword(Long userId, String password) {
        repo.changePassword(userId, password);
    }
}
