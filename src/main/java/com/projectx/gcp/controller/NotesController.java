package com.projectx.gcp.controller;

import com.projectx.gcp.model.Note;
import com.projectx.gcp.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> getAllNews() {


        return new ResponseEntity<List<Note>>(notesService.getAllNotes(), HttpStatus.OK);

    }

    @PostMapping("/notes")
    public ResponseEntity<Note> saveNote(@RequestBody Note note) {
        return new ResponseEntity<Note>(notesService.save(note),HttpStatus.CREATED);
    }
}



