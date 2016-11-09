package com.codevik.services;

import com.codevik.models.Note;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */
@Service
public interface INoteService {

    Note add(Note note) ;
    Note delete(int id) ;
    Note update(int id, String note);
    Note getById(int id);
    List<Note> getAll();
    int count();
}
