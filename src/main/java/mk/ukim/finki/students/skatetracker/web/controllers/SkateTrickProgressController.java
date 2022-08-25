package mk.ukim.finki.students.skatetracker.web.controllers;

import mk.ukim.finki.students.skatetracker.model.SkateTrickProgress;
import mk.ukim.finki.students.skatetracker.model.dto.NoteDto;
import mk.ukim.finki.students.skatetracker.service.SkateTrickProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/my-tricks")
@CrossOrigin(origins = "https://skate-helper-frontend.herokuapp.com")
public class SkateTrickProgressController {

    private final SkateTrickProgressService skateTrickProgressService;

    public SkateTrickProgressController(SkateTrickProgressService skateTrickProgressService) {
        this.skateTrickProgressService = skateTrickProgressService;
    }

    @GetMapping
    public List<SkateTrickProgress> getAll(@RequestHeader(value = "user-id", required = false) Long userId) {
        return skateTrickProgressService.getAll(userId);
    }

    @PostMapping("/level-up/{skateTrickId}")
    public SkateTrickProgress increaseTrickLevel(@RequestHeader(value = "user-id", required = false) Long userId, @PathVariable Long skateTrickId) {
        return skateTrickProgressService.increaseLevel(userId, skateTrickId);
    }

    @PostMapping("/add-note/{skateTrickId}")
    public SkateTrickProgress addNoteToTrick(@RequestHeader(value = "user-id", required = false) Long userId, @PathVariable Long skateTrickId, @RequestBody NoteDto note) {
        return skateTrickProgressService.addNote(userId, skateTrickId, note);
    }
}
