package com.projectx.gcp.repo;

import com.projectx.gcp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepo extends JpaRepository<Note,Long> {

}
