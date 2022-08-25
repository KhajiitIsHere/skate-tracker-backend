package mk.ukim.finki.students.skatetracker.service;

import mk.ukim.finki.students.skatetracker.model.SkateTrick;
import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;

import java.util.List;

public interface SkateTrickService {

    List<SkateTrick> getAll();

    SkateTrickProgress startLearningTrick(Long userId, Long skateTrickId);

}
