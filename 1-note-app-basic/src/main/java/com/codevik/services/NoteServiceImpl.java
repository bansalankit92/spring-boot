package com.codevik.services;

import com.codevik.models.Note;
import com.codevik.models.NoteDAO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */
@Service
public class NoteServiceImpl implements INoteService {

    NoteDAO dao = new NoteDAO();

    @Override
    public Note add(Note note) {
        return dao.create(note);
    }

    @Override
    public Note delete(int id) {
        Note n = dao.getById(id);
        dao.delete(id);
        return n;
    }

    @Override
    public Note update(int id, String note) {
        return dao.update(new Note(id, note));
    }

    @Override
    public Note getById(int id) {
        return dao.getById(id);
    }

    @Override
    public List<Note> getAll() {
        return dao.getAll();
    }

    @Override
    public int count() {
        return dao.count();
    }

}
