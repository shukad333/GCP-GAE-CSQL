package com.projectx.gcp.service;

import com.projectx.gcp.model.Note;
import com.projectx.gcp.repo.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepo notesRepo;

    public List<Note> getAllNotes(){
        return notesRepo.findAll();
    }

    public Note save(Note note) {
        note.setDate(new Date());
        return notesRepo.save(note);
    }

}
