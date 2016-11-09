package com.codevik.controllers;

import com.codevik.models.Note;
import com.codevik.services.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ankit Bansal
 */
@Controller
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    INoteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    Note getNote1(@PathVariable(value = "id") Integer id) {
        return service.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<Note> getNote(Model model) {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    Note addNote(String note) {
        return service.add(new Note(service.count() + 1, note));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    Note updateNote(@PathVariable(value = "id") int id, String note) {
        return service.update(id, note);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    Note deleteNote(@PathVariable(value = "id") int id) {
        return service.delete(id);
    }
} 
