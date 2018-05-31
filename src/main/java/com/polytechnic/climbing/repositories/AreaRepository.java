package com.polytechnic.climbing.repositories;

import com.polytechnic.climbing.models.area.AreaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends CrudRepository<AreaEntity, Long> {
}
