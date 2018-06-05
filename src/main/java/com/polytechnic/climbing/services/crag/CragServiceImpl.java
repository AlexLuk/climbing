package com.polytechnic.climbing.services.crag;

import com.polytechnic.climbing.converters.crag.CragEntityToCragDtoConverter;
import com.polytechnic.climbing.exceptions.EntityNotFoundException;
import com.polytechnic.climbing.models.crag.CragDto;
import com.polytechnic.climbing.repositories.CragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CragServiceImpl implements CragService {

    @Autowired
    private CragRepository cragRepository;

    @Autowired
    private CragEntityToCragDtoConverter toCragDtoConverter;

    @Override
    public CragDto getById(Long id) {
        return cragRepository.findById(id)
                             .map(toCragDtoConverter::convert)
                             .orElseThrow(EntityNotFoundException::new);
    }
}
