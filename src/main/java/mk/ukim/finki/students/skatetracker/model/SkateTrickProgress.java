package mk.ukim.finki.students.skatetracker.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SkateTrickProgress {

    private Long skateTrickId;
    private int level;
    private List<Note> notes;
    private Long userId;

    public SkateTrickProgress(Long userId, Long skateTrickId) {
        this.userId = userId;
        this.skateTrickId = skateTrickId;
        this.level = 1;
        this.notes = new ArrayList<>();
    }

    public SkateTrickProgress(Long skateTrickId) {
        this.userId = null;
        this.skateTrickId = skateTrickId;
        this.level = 1;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public void increaseLevel() {
        this.level += 1;
    }

}
