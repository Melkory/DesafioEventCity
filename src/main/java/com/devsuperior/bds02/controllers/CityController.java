package com.devsuperior.bds02.controllers;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping
    public List<CityDTO> findAll () {
        return null;
    }

    @PostMapping
    public CityDTO insert ( @RequestBody CityDTO dto ) {
        return null;
    }

    @DeleteMapping
    public void delete (Long id) {

    }

}
