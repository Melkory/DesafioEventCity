package com.devsuperior.bds02.controllers;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService service;

    public List<CityDTO> findAll () {
        return null;
    }

    public CityDTO insert ( @RequestBody CityDTO dto ) {
        return null;
    }

    public void delete (Long id) {

    }

}
