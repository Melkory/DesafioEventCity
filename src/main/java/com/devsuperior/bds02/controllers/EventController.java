package com.devsuperior.bds02.controllers;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private EventService service;

    @PutMapping
    public EventDTO update (EventDTO dto, Long id) {
        return null;
    }

}
