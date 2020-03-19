package com.agg.spring.reactive.convertor;

import com.agg.spring.reactive.command.UnitOfMeasureCommand;
import com.agg.spring.reactive.domain.UnitOfMeasure;
import org.springframework.core.convert.converter.Converter;

public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {
        return null;
    }
}
