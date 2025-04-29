package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<CityDTO> findAll ( Pageable pageable ) {
        return null;
    }

    public CityDTO insert (CityDTO dto) {
        return null;
    }

    public void delete (Long id) {

    }



}
