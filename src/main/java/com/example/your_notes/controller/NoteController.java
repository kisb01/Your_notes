package com.example.your_notes.controller;

import com.example.your_notes.command.NoteCommand;
import com.example.your_notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    public NoteService notes;

    @Autowired
    public NoteController(NoteService note) {
        this.notes = note;
    }

    @GetMapping("notes")
    String newNote(Model model) {
        model.addAttribute("note", new NoteCommand());
        return "notes";
    }

    @PostMapping("/notes")
    String save(@ModelAttribute NoteCommand noteCommand) {
        this.notes.addNote(noteCommand.getMessage());
        return "redirect:/index";
    }


}
