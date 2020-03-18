package com.agg.spring.reactive.convertor;

import com.agg.spring.reactive.command.RecipeCommand;
import com.agg.spring.reactive.domain.Recipe;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RecipeCommandToRecipe implements Converter<RecipeCommand, Recipe> {
    @Override
    public Recipe convert(RecipeCommand source) {
        return null;
    }
}
