package com.codevik.controllers;

import com.codevik.models.Note;
import com.codevik.services.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ankit Bansal
 */
@Controller
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    INoteService service;

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    ModelAndView getNote1(ModelAndView model, Integer id) {
        model.setViewName("note-ui");
        model.addObject("note", service.getById(id));
        return model;
    }

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView getNote(ModelAndView model) {
        model.setViewName("note-ui");
        model.addObject("notes", service.getAll());
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    ModelAndView addNote(ModelAndView model,String note) {
        model.setViewName("note-ui");
        model.addObject("noteAdded", service.add(new Note(service.count() + 1, note)));
        return model;
    }

    @RequestMapping(value = "/update")
    ModelAndView updateNote(ModelAndView model, int id, String note) {
        model.setViewName("note-ui");
        model.addObject("noteUpdated",  service.update(id, note));
        return model;
    }

    @RequestMapping(value = "/delete")
    ModelAndView deleteNote(ModelAndView model, int id) {
        model.setViewName("note-ui");
        model.addObject("noteDeleted", service.delete(id));
        return model;
    }
} 
