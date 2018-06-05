package com.polytechnic.climbing.repositories;

import com.polytechnic.climbing.models.crag.CragEntity;
import org.springframework.data.repository.CrudRepository;

public interface CragRepository extends CrudRepository<CragEntity, Long> {
}
