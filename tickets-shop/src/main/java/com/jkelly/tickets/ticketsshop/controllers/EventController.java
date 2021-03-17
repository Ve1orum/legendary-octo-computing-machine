package com.jkelly.tickets.ticketsshop.controllers;

import com.jkelly.tickets.ticketsshop.models.Event;
import com.jkelly.tickets.ticketsshop.repos.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/")
    public String eventsList(Model model) {
        Iterable<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "eventsList";
    }

    @GetMapping("/add-event")
    public String addPost(Model model) { return "eventsList"; }

    @PostMapping("/add-event")
    public String addNewEvent(@RequestParam String title,
                              @RequestParam Date date,
                              Model model) {
        Event event = new Event(title, date);
        eventRepository.save(event);
        return "redirect:/";
    }

}
