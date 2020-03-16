package com.agg.spring.reactive.repository;

import com.agg.spring.reactive.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,String> {
}
