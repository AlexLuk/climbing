package com.polytechnic.climbing.converters.crag;

import com.polytechnic.climbing.models.crag.CragDto;
import com.polytechnic.climbing.models.crag.CragEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CragEntityToCragDtoConverter implements Converter<CragEntity, CragDto> {
    @Override
    public CragDto convert(CragEntity source) {
        CragDto cragDTO = new CragDto();
        cragDTO.setId(source.getCragId());
        cragDTO.setTitle(source.getTitle());
        return cragDTO;
    }
}
