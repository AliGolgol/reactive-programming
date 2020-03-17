package com.agg.spring.reactive.repository;

import com.agg.spring.reactive.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,String> {

    Optional<Category> findByDescription(String description);
}
