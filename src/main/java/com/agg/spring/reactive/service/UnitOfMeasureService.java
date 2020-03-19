package com.agg.spring.reactive.service;

import com.agg.spring.reactive.command.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

public interface UnitOfMeasureService {
    Flux<UnitOfMeasureCommand> listAllUOM();
}
