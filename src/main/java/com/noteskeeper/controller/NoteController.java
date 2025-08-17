package com.noteskeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.noteskeeper.model.Note;
import com.noteskeeper.repository.NoteRepository;
@Controller
public class NoteController {
    private final NoteRepository noteRepo;

    public NoteController(NoteRepository noteRepo) {
        this.noteRepo = noteRepo;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("notes", noteRepo.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String addNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "add-note";
    }

    @PostMapping("/add")
    public String addNote(@ModelAttribute Note note) {
        noteRepo.save(note);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editNoteForm(@PathVariable Long id, Model model) {
        Note note = noteRepo.findById(id).orElseThrow();
        model.addAttribute("note", note);
        return "edit-note";
    }

    @PostMapping("/edit/{id}")
    public String editNote(@PathVariable Long id, @ModelAttribute Note note) {
        // Fetch existing note from DB
        Note existingNote = noteRepo.findById(id).orElseThrow();

        // Update fields
        existingNote.setTitle(note.getTitle());
        existingNote.setContent(note.getContent());
        existingNote.setColor(note.getColor());
        noteRepo.save(existingNote);
        return "edit-note:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteRepo.deleteById(id);
        return "redirect:/";
    }
    

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "error"; // error.html
    }
}
