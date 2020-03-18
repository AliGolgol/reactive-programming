package com.agg.spring.reactive.service;

import com.agg.spring.reactive.command.RecipeCommand;
import com.agg.spring.reactive.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(String id);

    RecipeCommand findCommandById(String id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(String id);
}
