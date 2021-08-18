package com.example.your_notes.service;

import com.example.your_notes.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteImpl implements NoteService {

    private List<Note> notes;

    public NoteImpl() {
        this.notes = new ArrayList<>();
    }

    @Override
    public int countNotes() {
        return notes.size();
    }

    @Override
    public void addNote(String message) {
        this.notes.add(new Note(message));
    }

    @Override
    public List<Note> getAllNotes() {
        return this.notes;
    }
}
