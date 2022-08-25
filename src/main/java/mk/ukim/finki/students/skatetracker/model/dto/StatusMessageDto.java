package mk.ukim.finki.students.skatetracker.model.dto;

import lombok.Getter;

@Getter
public class StatusMessageDto {
    private String text;

    public StatusMessageDto(String text) {
        this.text = text;
    }
}
