package com.polytechnic.climbing.converters.area;

import com.polytechnic.climbing.models.area.AreaEntity;
import com.polytechnic.climbing.models.area.AreaForm;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AreaFormToAreaEntityConverter implements Converter<AreaForm, AreaEntity> {
    public AreaEntity convert(AreaForm areaForm) {
        AreaEntity areaEntity = new AreaEntity();
        areaEntity.setTitle(areaForm.getTitle());
        return areaEntity;
    }
}
