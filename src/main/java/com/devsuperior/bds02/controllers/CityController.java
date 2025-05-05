package com.devsuperior.bds02.controllers;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.services.CityService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping
    public ResponseEntity<Page<CityDTO>> findAll ( Pageable pageable ) {
        Page<CityDTO> result = service.findAllPaged(pageable);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public CityDTO insert ( @RequestBody CityDTO dto ) {
        return null;
    }

    @DeleteMapping
    public void delete (Long id) {

    }

}
