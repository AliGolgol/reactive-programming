package com.agg.spring.reactive.repository;

import com.agg.spring.reactive.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,String> {
}
