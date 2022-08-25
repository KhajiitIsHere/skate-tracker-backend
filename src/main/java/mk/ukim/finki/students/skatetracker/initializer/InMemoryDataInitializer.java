package mk.ukim.finki.students.skatetracker.initializer;

import mk.ukim.finki.students.skatetracker.exceptions.IncorrectPasswordException;
import mk.ukim.finki.students.skatetracker.exceptions.SkateTrickDoesntExistException;
import mk.ukim.finki.students.skatetracker.exceptions.UserDoesntExistException;
import mk.ukim.finki.students.skatetracker.exceptions.UsernameTakenException;
import mk.ukim.finki.students.skatetracker.model.*;
import mk.ukim.finki.students.skatetracker.model.data.Levels;
import mk.ukim.finki.students.skatetracker.model.dto.UserDto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class InMemoryDataInitializer {

    List<SkateTrick> skateTricks;
    List<SkateTrickProgress> skateTrickProgresses;
    List<User> users;
    List<User> loggedInUsers;

    @PostConstruct
    public void initializeData() {

        skateTricks = new ArrayList<>();
        skateTrickProgresses = new ArrayList<>();
        users = new ArrayList<>();
        loggedInUsers = new ArrayList<>();

        String ollieDescription = "The ollie is a skateboarding trick where the rider and board leap into the air without the use of the rider\\'s hands.";
        String kickFlipDescription = "A kickflip is a common skateboard trick that pops the skater up into the air, using their feet to flip the board a full rotation—360 degrees.";
        String fiftyFiftyDescription = "A 50/50 grind is a skateboarding trick where the skateboarder ollies their board onto an obstacle (like a handrail or bench), grinding forward on the middle part of the deck before landing their board on the ground again.";
        String getComfortableOnBoardDescription = "The art of getting comfortable on your board.";
        String shuvitDescription = "Pivot the board 180 degrees";
        String popShuvitDescription = "A combination of an ollie and a shuvit, popping up the board as it spins 180 degrees in the air while you hover above it without spinning";
        String heelFlipDescription = "A heelflip starts with the skateboarder performing an ollie then kicking their front foot out diagonally, using their front heel to flip the board in the air";
        String frontside180Description = "A frontside 180 is a skateboarding trick that combines an ollie with a 180-degree turn, leading with your chest (front).";
        String fakieShuvitDescription = "Pivot the board 180 degrees in a fakie position, most people say fakie shuvit is easier than regular shuvit.";
        String manualDescription = "Hold the board on the back wheels.";

        SkateTrick getComfortableOnBoard = new SkateTrick("Get comfortable on board", getComfortableOnBoardDescription, "https://www.youtube.com/embed/pMIWCvc-0f8", Levels.COMFORT_LEVELS, "ride.jpg", new ArrayList<>());
        SkateTrick ollie = new SkateTrick("Ollie", ollieDescription, "https://www.youtube-nocookie.com/embed/IFslOXRqM2I?showinfo=0", Levels.OLLIE_LEVELS, "ollie.jpg", List.of(new Prerequisite(getComfortableOnBoard.getId(), 11)));
        SkateTrick shuvit = new SkateTrick("Shuvit", shuvitDescription, "https://www.youtube.com/embed/JYuwXjlTqZw", Levels.SHUVIT_LEVELS, "shuvit.jpg", List.of(new Prerequisite(getComfortableOnBoard.getId(), 9)));
        SkateTrick kickFlip = new SkateTrick("KickFlip", kickFlipDescription, "https://www.youtube.com/embed/EZhbRmYHjlI?feature=oembed", Levels.KICKFLIP_LEVELS, "kickflip.jpg", List.of(new Prerequisite(ollie.getId(), 6), new Prerequisite(shuvit.getId(), 7)));
        SkateTrick popShuvit = new SkateTrick("Pop shuvit", popShuvitDescription, "https://www.youtube.com/embed/dNGmlRsTP-g?feature=oembed", Levels.POP_SHUVIT_LEVELS, "pop-shuvit.jpg", List.of(new Prerequisite(shuvit.getId(), 9), new Prerequisite(ollie.getId(), 6)));
        SkateTrick manual = new SkateTrick("Manual", manualDescription, "https://www.youtube.com/embed/2KeKBg_-GAw?feature=oembed", Levels.MANUAL_LEVELS, "manual.jpg", List.of(new Prerequisite(getComfortableOnBoard.getId(), 11)));
        SkateTrick fakieShuvit = new SkateTrick("Fakie shuvit", fakieShuvitDescription, "https://www.youtube.com/embed/7mYSWAwSeWY", Levels.FAKIE_SHUVIT_LEVELS, "fakie-shuvit.jpg", List.of(new Prerequisite(getComfortableOnBoard.getId(), 9)));
        SkateTrick frontside180 = new SkateTrick("Frontside 180", frontside180Description, "https://www.youtube.com/embed/s-Tw11EZCv4?feature=oembed", Levels.FRONTSIDE_180_LEVELS, "frontside180.jpg", List.of(new Prerequisite(ollie.getId(), 6), new Prerequisite(shuvit.getId(), 7)));
        SkateTrick heelFlip = new SkateTrick("HeelFlip", heelFlipDescription, "https://www.youtube.com/embed/ytMHhwo-NL4?feature=oembed", Levels.HEELFLIP_LEVELS, "heelflip.jpg", List.of(new Prerequisite(ollie.getId(), 6), new Prerequisite(shuvit.getId(), 7)));
        SkateTrick fiftyFifty = new SkateTrick("50/50", fiftyFiftyDescription, "https://www.youtube.com/embed/zbUsSZItFbo", Levels.FIFTYFIFTY_LEVELS, "50-50-grind.jpg", List.of(new Prerequisite(ollie.getId(), 12), new Prerequisite(kickFlip.getId(), 10)));

        skateTricks.addAll(List.of(getComfortableOnBoard, manual, fakieShuvit, shuvit, ollie, frontside180, popShuvit, kickFlip, heelFlip, fiftyFifty));
    }

    public List<SkateTrick> getAllSkateTricks() {
        return skateTricks;
    }

    public SkateTrick getSkateTrickById(Long skateTrickId) {
        return skateTricks.stream()
                .filter(trick -> Objects.equals(trick.getId(), skateTrickId))
                .findFirst()
                .orElseThrow(SkateTrickDoesntExistException::new);
    }

    public SkateTrickProgress addSkateTrickProgress(SkateTrickProgress skateTrickProgress) {
        skateTrickProgresses.add(skateTrickProgress);
        return skateTrickProgress;
    }

    public List<SkateTrickProgress> getAllSkateTrickProgresses(Long userId) {
        if (userId == null)
            return skateTrickProgresses.stream().filter(trick -> trick.getUserId() == null).collect(Collectors.toList());
        else
            return skateTrickProgresses.stream().filter(trick -> Objects.equals(trick.getUserId(), userId)).collect(Collectors.toList());
    }

    public SkateTrickProgress getProgressForSkateTrick(Long userId, Long skateTrickId) {
        if (userId == null)
            return skateTrickProgresses.stream()
                    .filter(trick -> Objects.equals(trick.getSkateTrickId(), skateTrickId) && trick.getUserId() == null)
                    .findFirst()
                    .orElseThrow(SkateTrickDoesntExistException::new);
        else
            return skateTrickProgresses.stream()
                    .filter(trick -> Objects.equals(trick.getSkateTrickId(), skateTrickId) && Objects.equals(trick.getUserId(), userId))
                    .findFirst()
                    .orElseThrow(SkateTrickDoesntExistException::new);
    }

    public boolean registerUser(String username, String password) {
        if (users.stream().anyMatch(user -> user.getUsername().equals(username)))
            return false;

        users.add(new User(username, password));
        return true;
    }

    public UserDto logInUser(String username, String password){
        User user = loggedInUsers.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);

        if (user == null)
            user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);

        if (user == null)
            throw new UserDoesntExistException();

        if (!user.getPassword().equals(password))
            throw new IncorrectPasswordException();

        loggedInUsers.add(user);

        return new UserDto(user.getUsername(), user.getId());
    }

    public void logOffUser(Long userId) {
        loggedInUsers.removeIf(user -> user.getId().equals(userId));
    }

    public void changePassword(Long userId, String password) {
        users.stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .ifPresent(u -> {
                    System.out.println(u.getUsername());
                    u.changePassword(password);
                });
    }

}
