package com.example.your_notes.service;

import com.example.your_notes.model.Note;

import java.util.List;

public interface NoteService {
    void addNote(String message);

    int countNotes();

    List<Note> getAllNotes();
}
