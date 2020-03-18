package com.agg.spring.reactive.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NoteCommand {
    private String id;
    private String recipeNotes;
}
