package mk.ukim.finki.students.skatetracker.service.impl;

import mk.ukim.finki.students.skatetracker.initializer.InMemoryDataInitializer;
import mk.ukim.finki.students.skatetracker.model.SkateTrick;
import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;
import mk.ukim.finki.students.skatetracker.service.SkateTrickService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SkateTrickServiceImplementation implements SkateTrickService {

    private final InMemoryDataInitializer repo;

    public SkateTrickServiceImplementation(InMemoryDataInitializer repo) {
        this.repo = repo;
    }

    @Override
    public List<SkateTrick> getAll() {
        return this.repo.getAllSkateTricks();
    }

    @Override
    public SkateTrickProgress startLearningTrick(Long userId, Long skateTrickId) {
        if(repo.getAllSkateTrickProgresses(userId)
                .stream()
                .anyMatch(trick -> Objects.equals(trick.getSkateTrickId(), skateTrickId))
        )
            return null;

        if(userId == null)
            return repo.addSkateTrickProgress(new SkateTrickProgress(skateTrickId));
        else
            return repo.addSkateTrickProgress(new SkateTrickProgress(userId, skateTrickId));
    }
}
