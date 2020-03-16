package com.agg.spring.reactive.repository.reactive;

import com.agg.spring.reactive.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe,String> {
}
