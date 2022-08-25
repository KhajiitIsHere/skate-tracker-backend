package mk.ukim.finki.students.skatetracker.web.controllers;

import mk.ukim.finki.students.skatetracker.exceptions.IncorrectPasswordException;
import mk.ukim.finki.students.skatetracker.exceptions.UserDoesntExistException;
import mk.ukim.finki.students.skatetracker.exceptions.UsernameTakenException;
import mk.ukim.finki.students.skatetracker.model.dto.LoginUserDto;
import mk.ukim.finki.students.skatetracker.model.dto.PasswordDto;
import mk.ukim.finki.students.skatetracker.model.dto.StatusMessageDto;
import mk.ukim.finki.students.skatetracker.model.dto.UserDto;
import mk.ukim.finki.students.skatetracker.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "https://skate-helper-frontend.herokuapp.com")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginUserDto loginUser){
        try {
            UserDto userDto = userService.login(loginUser.getUsername(), loginUser.getPassword());
            return ResponseEntity.ok(userDto);
        } catch (UserDoesntExistException exception){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("User doesn't exist"));
        } catch (IncorrectPasswordException exception){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("Incorrect password"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody LoginUserDto loginUser){
        try {
            UserDto userDto = userService.register(loginUser.getUsername(), loginUser.getPassword());
            return ResponseEntity.ok(userDto);
        } catch (UsernameTakenException exception) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("Username taken"));
        }
    }

    @PostMapping("/logoff")
    public ResponseEntity logoff(@RequestHeader(value = "user-id", required = false) Long userId) {
        userService.logoff(userId);
        return ResponseEntity.ok().body(new StatusMessageDto("Logged off successfully"));
    }

    @PostMapping("/change-password")
    public ResponseEntity changePassword(@RequestHeader(value = "user-id", required = false) Long userId, @RequestBody PasswordDto passwordDto){
        System.out.printf("Changing password for %d", userId);
        userService.changePassword(userId, passwordDto.getPassword());
        return ResponseEntity.ok().body(new StatusMessageDto("Password changed successfully"));
    }
}
