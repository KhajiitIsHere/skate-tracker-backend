package mk.ukim.finki.students.skatetracker.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Note {

    Long id;

    LocalDateTime dateCreated;

    String text;

    public Note(LocalDateTime dateCreated, String text) {
        this.dateCreated = dateCreated;
        this.text = text;
        this.id = (long)(Math.random() * 1000);
    }

}
