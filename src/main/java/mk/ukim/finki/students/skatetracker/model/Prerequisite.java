package mk.ukim.finki.students.skatetracker.model;

import lombok.Getter;

@Getter
public class Prerequisite {

    Long skateTrickId;
    int requiredLevel;

    public Prerequisite(Long skateTrickId, int requiredLevel) {
        this.skateTrickId = skateTrickId;
        this.requiredLevel = requiredLevel;
    }
}
