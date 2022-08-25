package mk.ukim.finki.students.skatetracker.model;

import lombok.Getter;

import java.util.List;

@Getter
public class SkateTrick {

    Long id;

    String name;

    String shortDescription;

    String videoLink;

    List<Level> levels;

    String imageLink;

    List<Prerequisite> prerequisites;

    public SkateTrick(String name, String shortDescription, String videoLink, List<Level> levels, String imageLink, List<Prerequisite> prerequisites) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.videoLink = videoLink;
        this.levels = levels;
        this.imageLink = imageLink;
        this.prerequisites = prerequisites;
        this.id = (long)(Math.random() * 1000);
    }

}
