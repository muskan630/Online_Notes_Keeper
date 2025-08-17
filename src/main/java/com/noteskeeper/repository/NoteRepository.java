package com.noteskeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noteskeeper.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}