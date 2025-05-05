package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    @Transactional(readOnly = true)
    public Page<CityDTO> findAllPaged ( Pageable pageable ) {
        Page<City> result = repository.findAll(pageable);
        return result.map(x -> new CityDTO(x));
    }

    public CityDTO insert (CityDTO dto) {
        return null;
    }

    public void delete (Long id) {

    }



}
