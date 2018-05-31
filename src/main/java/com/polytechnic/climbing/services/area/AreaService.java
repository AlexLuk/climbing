package com.polytechnic.climbing.services.area;

import com.polytechnic.climbing.models.area.AreaDto;
import com.polytechnic.climbing.models.area.AreaForm;
import org.springframework.stereotype.Service;

public interface AreaService {
    AreaDto getById(Long id);

    Long create(AreaForm areaForm);
}
