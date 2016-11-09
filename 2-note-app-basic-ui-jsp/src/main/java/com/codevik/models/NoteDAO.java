package com.codevik.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit Bansal on 08-Nov-16.
 */
public class NoteDAO {
    private List<Note> noteList = new ArrayList<>();

    public Note create(Note n) {
        noteList.add(n);
        return n;
    }

    public Note getByIdJ8(int id) {
        return (Note) noteList.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public Note getById(int id) {
        Note emp = null;
        for (Note Note : noteList) {
            if (Note.getId() == id) {
                emp = Note;
                break;
            }
        }
        return emp;
    }

    public int count() {
        return noteList.size();
    }

    public List<Note> getAll() {
        return noteList;
    }

    public Note update(Note note) {
        noteList.forEach(n -> {
            if (n.getId() == note.getId())
                n.setNote(new String(note.getNote()));
        });
        return note;
    }

    public void delete(int id) {
        noteList.removeIf(n -> n.getId() == id);

    }
}
