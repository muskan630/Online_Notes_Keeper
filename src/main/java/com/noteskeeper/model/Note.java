package com.noteskeeper.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 1000)
    private String content;
    private String color;
    private LocalDateTime createdAt = LocalDateTime.now();

 
    // Getters and Setters
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
 
 
 public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
 
 
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
 
 
    public String getColor() {
        return color; }
 public void setColor(String color) {
       this.color = color; }
 
 
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
 
}
