package mk.ukim.finki.students.skatetracker.web.controllers;

import mk.ukim.finki.students.skatetracker.model.SkateTrick;
import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;
import mk.ukim.finki.students.skatetracker.service.SkateTrickService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/all-tricks")
@CrossOrigin(origins = "https://skate-helper-frontend.herokuapp.com")
public class SkateTrickController {
    private final SkateTrickService skateTrickService;

    public SkateTrickController(SkateTrickService skateTrickService) {
        this.skateTrickService = skateTrickService;
    }

    @GetMapping
    public List<SkateTrick> getAll() {
        return skateTrickService.getAll();
    }

    @PostMapping("/{skateTrickId}")
    public SkateTrickProgress trackTrick(@RequestHeader(value = "user-id", required = false) Long userId, @PathVariable Long skateTrickId) {
        return skateTrickService.startLearningTrick(userId, skateTrickId);
    }

}
