package mk.ukim.finki.students.skatetracker.service.impl;

import mk.ukim.finki.students.skatetracker.initializer.InMemoryDataInitializer;
import mk.ukim.finki.students.skatetracker.model.Note;
import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;
import mk.ukim.finki.students.skatetracker.model.dto.NoteDto;
import mk.ukim.finki.students.skatetracker.service.SkateTrickProgressService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SkateTrickProgressServiceImplementation implements SkateTrickProgressService {

    private final InMemoryDataInitializer repo;

    public SkateTrickProgressServiceImplementation(InMemoryDataInitializer repo) {
        this.repo = repo;
    }

    @Override
    public List<SkateTrickProgress> getAll(Long userId) {
        return repo.getAllSkateTrickProgresses(userId);
    }

    @Override
    public SkateTrickProgress getById(Long userId, Long skateTrickId) {
        return repo.getProgressForSkateTrick(userId, skateTrickId);
    }

    @Override
    public SkateTrickProgress increaseLevel(Long userId, Long skateTrickId) {
        final SkateTrickProgress skateTrickProgress = repo.getProgressForSkateTrick(userId, skateTrickId);
        if (skateTrickProgress == null)
            return null;
        skateTrickProgress.increaseLevel();
        return skateTrickProgress;
    }

    @Override
    public SkateTrickProgress addNote(Long userId, Long skateTrickId, NoteDto note) {
        final SkateTrickProgress skateTrickProgress = repo.getProgressForSkateTrick(userId, skateTrickId);
        if (skateTrickProgress == null)
            return null;
        skateTrickProgress.addNote(new Note(LocalDateTime.now(), note.getText()));
        return skateTrickProgress;
    }
}
