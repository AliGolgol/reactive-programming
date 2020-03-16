package com.agg.spring.reactive.repository;

import com.agg.spring.reactive.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,String> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
