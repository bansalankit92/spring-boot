package com.codevik.models;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */

public class Note implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String note;
    private Timestamp createdAt=new Timestamp(Calendar.getInstance().getTime().getTime());

    public Note( ) {
    }
    public Note(int id) {
        this.id = id;
    }

    public Note(String note) {
        this.note = note;
    }

    public Note(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public Note(int id, String note, Timestamp createdAt) {
        this.id = id;
        this.note = note;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }



    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        return getId() == note.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }
}
