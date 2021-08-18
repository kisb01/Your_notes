package com.example.your_notes.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Note {

    private String message;

    public Note(String message) {
        this.message = message;
    }

}
