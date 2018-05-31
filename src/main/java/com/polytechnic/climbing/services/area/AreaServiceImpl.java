package com.polytechnic.climbing.services.area;

import com.polytechnic.climbing.converters.area.AreaEntityToAreaDtoConverter;
import com.polytechnic.climbing.converters.area.AreaFormToAreaEntityConverter;
import com.polytechnic.climbing.exceptions.EntityNotFoundException;
import com.polytechnic.climbing.models.area.AreaDto;
import com.polytechnic.climbing.models.area.AreaEntity;
import com.polytechnic.climbing.models.area.AreaForm;
import com.polytechnic.climbing.repositories.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

@Service
public class AreaServiceImpl implements AreaService {

    private final AreaRepository areaRepository;

    private final AreaEntityToAreaDtoConverter toAreaDtoConverter;

    private final AreaFormToAreaEntityConverter toAreaEntityConverter;

    @Autowired
    public AreaServiceImpl(AreaRepository areaRepository,
                           AreaEntityToAreaDtoConverter toAreaDtoConverter,
                           AreaFormToAreaEntityConverter toAreaEntityConverter) {
        this.areaRepository = areaRepository;
        this.toAreaDtoConverter = toAreaDtoConverter;
        this.toAreaEntityConverter = toAreaEntityConverter;
    }

    @Override
    public AreaDto getById(Long id) {
        return areaRepository.findById(id)
                             .map(toAreaDtoConverter::convert)
                             .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Long create(AreaForm areaForm) {
        // TODO: 5/31/2018 add validation
        AreaEntity areaEntity = toAreaEntityConverter.convert(areaForm);
        if (Objects.isNull(areaEntity)) {
            throw new UnsupportedOperationException();
        }
        AreaEntity persistedEntity = areaRepository.save(areaEntity);

        return persistedEntity.getId();
    }
}
