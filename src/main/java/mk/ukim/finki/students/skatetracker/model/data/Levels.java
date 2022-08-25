package mk.ukim.finki.students.skatetracker.model.data;

import mk.ukim.finki.students.skatetracker.model.Level;

import java.util.ArrayList;
import java.util.List;

public class Levels {
    public static List<Level> OLLIE_LEVELS;
    public static List<Level> COMFORT_LEVELS;
    public static List<Level> KICKFLIP_LEVELS;
    public static List<Level> FIFTYFIFTY_LEVELS;
    public static List<Level> SHUVIT_LEVELS;
    public static List<Level> POP_SHUVIT_LEVELS;
    public static List<Level> FRONTSIDE_180_LEVELS;
    public static List<Level> MANUAL_LEVELS;
    public static List<Level> HEELFLIP_LEVELS;
    public static List<Level> FAKIE_SHUVIT_LEVELS;

    static  {
        OLLIE_LEVELS = new ArrayList<>();
        COMFORT_LEVELS = new ArrayList<>();
        KICKFLIP_LEVELS = new ArrayList<>();
        FIFTYFIFTY_LEVELS = new ArrayList<>();
        SHUVIT_LEVELS = new ArrayList<>();
        POP_SHUVIT_LEVELS = new ArrayList<>();
        FRONTSIDE_180_LEVELS = new ArrayList<>();
        MANUAL_LEVELS= new ArrayList<>();
        HEELFLIP_LEVELS = new ArrayList<>();
        FAKIE_SHUVIT_LEVELS  = new ArrayList<>();

        initializeOllieLevels();
        initializeComfortLevels();
        initializeKickFlipLevels();
        initializeFiftyFiftyLevels();
        initializeShuvitLevels();
        initializePopShuvitLevels();
        initializeFrontSide180Levels();
        initializeManualLevels();
        initializeHeelFlipLevels();
        initializeFakieShuvitLevels();
    }

    private static void initializeOllieLevels() {
        OLLIE_LEVELS.add(new Level("Do a rocket ollie"));
        OLLIE_LEVELS.add(new Level("Lift board off of ground"));
        OLLIE_LEVELS.add(new Level("Ollie over a small branch"));
        OLLIE_LEVELS.add(new Level("Level out board in air"));
        OLLIE_LEVELS.add(new Level("Ollie over a 0.2L bottle"));
        OLLIE_LEVELS.add(new Level("Ollie over a 1L bottle"));
        OLLIE_LEVELS.add(new Level("Ollie out of a curb"));
        OLLIE_LEVELS.add(new Level("Ollie onto a curb"));
        OLLIE_LEVELS.add(new Level("Ollie onto a box"));
        OLLIE_LEVELS.add(new Level("Ollie over 2 stairs"));
        OLLIE_LEVELS.add(new Level("Ollie over 3 stairs"));
        OLLIE_LEVELS.add(new Level("Ollie over 4 stairs"));
    }

    private static void initializeComfortLevels() {
        COMFORT_LEVELS.add(new Level("Get comfortable standing on the board"));
        COMFORT_LEVELS.add(new Level("Push the board without getting the other foot on"));
        COMFORT_LEVELS.add(new Level("Get the other foot on the board"));
        COMFORT_LEVELS.add(new Level("Pivot the front foot while riding"));
        COMFORT_LEVELS.add(new Level("Cruise for 5 minutes straight"));
        COMFORT_LEVELS.add(new Level("Get comfortable with turning with leaning"));
        COMFORT_LEVELS.add(new Level("Spend 2 weeks just riding the board"));
        COMFORT_LEVELS.add(new Level("Do your first kick-turns"));
        COMFORT_LEVELS.add(new Level("Ride your board for 1 week and for turns only use kick-turning"));
        COMFORT_LEVELS.add(new Level("Gain some speed using tic-tacs"));
        COMFORT_LEVELS.add(new Level("Ride 100m using only tic-tacs"));
    }

    private static void initializeManualLevels() {
        MANUAL_LEVELS.add(new Level("Get comfortable with kicking the tail to te ground and back"));
        MANUAL_LEVELS.add(new Level("Hold the manual for a second"));
        MANUAL_LEVELS.add(new Level("Hold the manual for a second while riding"));
        MANUAL_LEVELS.add(new Level("Hold the manual for three seconds while riding"));
        MANUAL_LEVELS.add(new Level("Hold the manual for five seconds while riding"));
        MANUAL_LEVELS.add(new Level("Hold the manual for ten seconds while riding"));
    }

    private static void initializeKickFlipLevels() {
        KICKFLIP_LEVELS.add(new Level("Flip your board, you dont have to land"));
        KICKFLIP_LEVELS.add(new Level("Flip your board and get one leg on board"));
        KICKFLIP_LEVELS.add(new Level("Flip your board and get one leg on board, do this 5 time in a sequence"));
        KICKFLIP_LEVELS.add(new Level("Land a kickflip with both legs on board"));
        KICKFLIP_LEVELS.add(new Level("Land a kickflip with both legs on board 5 times in a sequence"));
        KICKFLIP_LEVELS.add(new Level("Kickflip over a 0.2L bottle"));
        KICKFLIP_LEVELS.add(new Level("Kickflip over a 1L bottle"));
        KICKFLIP_LEVELS.add(new Level("Kickflip onto a curb"));
        KICKFLIP_LEVELS.add(new Level("Kickflip over 2 stairs"));
        KICKFLIP_LEVELS.add(new Level("Kickflip over 3 stairs"));
    }

    private static void initializeShuvitLevels() {
        SHUVIT_LEVELS.add(new Level("Land a shuvit with one foot on board (while standing still)"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with one foot on board 5 times in a sequence (while standing still)"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with both feet on board (while standing still)"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with both feet on board 5 times in a sequence (while standing still)"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with one foot on board"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with one foot on board 5 times in a sequence"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with both feet on board"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with both feet on board 5 times in a sequence"));
        SHUVIT_LEVELS.add(new Level("Land a shuvit with both feet on board 10 times in a sequence"));
    }

    private static void initializePopShuvitLevels() {
        POP_SHUVIT_LEVELS.add(new Level("Land a pop shuvit with one foot on board"));
        POP_SHUVIT_LEVELS.add(new Level("Land a pop shuvit"));
        POP_SHUVIT_LEVELS.add(new Level("Pop shuvit over a 0.2L bottle"));
        POP_SHUVIT_LEVELS.add(new Level("Pop shuvit over a 1L bottle"));
        POP_SHUVIT_LEVELS.add(new Level("Pop shuvit onto a curb"));
        POP_SHUVIT_LEVELS.add(new Level("Pop shuvit over 2 stairs"));
        POP_SHUVIT_LEVELS.add(new Level("Pop shuvit over 3 stairs"));
    }

    private static void initializeFrontSide180Levels() {
        FRONTSIDE_180_LEVELS.add(new Level("Do a 180 turn without pop"));
        FRONTSIDE_180_LEVELS.add(new Level("Do five 180 turns without pop"));
        FRONTSIDE_180_LEVELS.add(new Level("Land a frontside 180 with one foot"));
        FRONTSIDE_180_LEVELS.add(new Level("Land a frontside 180 with both feet"));
        FRONTSIDE_180_LEVELS.add(new Level("Land a frontside 180 with both feet 5 times in a row"));
        FRONTSIDE_180_LEVELS.add(new Level("Frontside 180 over a 0.2L bottle"));
        FRONTSIDE_180_LEVELS.add(new Level("Frontside 180 over a 1L bottle"));
    }

    private static void initializeHeelFlipLevels() {
        HEELFLIP_LEVELS.add(new Level("Flip your board, you dont have to land"));
        HEELFLIP_LEVELS.add(new Level("Flip your board and get one leg on board"));
        HEELFLIP_LEVELS.add(new Level("Flip your board and get one leg on board, do this 5 time in a sequence"));
        HEELFLIP_LEVELS.add(new Level("Land a heelflip with both legs on board"));
        HEELFLIP_LEVELS.add(new Level("Land a heelflip with both legs on board 5 times in a sequence"));
        HEELFLIP_LEVELS.add(new Level("Heelflip over a 0.2L bottle"));
        HEELFLIP_LEVELS.add(new Level("Heelflip over a 1L bottle"));
        HEELFLIP_LEVELS.add(new Level("Heelflip onto a curb"));
        HEELFLIP_LEVELS.add(new Level("Heelflip over 2 stairs"));
        HEELFLIP_LEVELS.add(new Level("Heelflip over 3 stairs"));
    }

    private static void initializeFakieShuvitLevels() {
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with one foot on board (while standing still)"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with one foot on board 5 times in a sequence (while standing still)"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with both feet on board (while standing still)"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with both feet on board 5 times in a sequence (while standing still)"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with one foot on board"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with one foot on board 5 times in a sequence"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with both feet on board"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with both feet on board 5 times in a sequence"));
        FAKIE_SHUVIT_LEVELS.add(new Level("Land a fakie shuvit with both feet on board 10 times in a sequence"));
    }

    private static void initializeFiftyFiftyLevels() {
        FIFTYFIFTY_LEVELS.add(new Level("Ollie onto a short platform"));
        FIFTYFIFTY_LEVELS.add(new Level("Ollie onto a short platform and ollie off to the side"));
        FIFTYFIFTY_LEVELS.add(new Level("Land a 5050 on a small ledge, you dont have to hold it"));
        FIFTYFIFTY_LEVELS.add(new Level("Hold a 5050 for 1 second"));
        FIFTYFIFTY_LEVELS.add(new Level("Hold a 5050 for 5 seconds"));
        FIFTYFIFTY_LEVELS.add(new Level("Holda 5050 for 10 seconds"));
    }
}
