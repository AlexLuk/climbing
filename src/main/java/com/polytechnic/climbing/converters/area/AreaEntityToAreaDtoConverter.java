package com.polytechnic.climbing.converters.area;

import com.polytechnic.climbing.models.area.AreaDto;
import com.polytechnic.climbing.models.area.AreaEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AreaEntityToAreaDtoConverter implements Converter<AreaEntity, AreaDto> {
    @Override
    public AreaDto convert(AreaEntity source) {
        AreaDto areaDto = new AreaDto();
        areaDto.setTitle(source.getTitle());
        areaDto.setId(source.getId());
        return areaDto;
    }
}
