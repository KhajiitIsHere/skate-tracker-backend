package mk.ukim.finki.students.skatetracker.service;

import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;
import mk.ukim.finki.students.skatetracker.model.dto.NoteDto;

import java.util.List;

public interface SkateTrickProgressService {
    List<SkateTrickProgress> getAll(Long userId);

    SkateTrickProgress getById(Long userId, Long skateTrickProgressId);

    SkateTrickProgress increaseLevel(Long userId, Long skateTrickId);

    SkateTrickProgress addNote(Long userId, Long skateTrickId, NoteDto note);
}
