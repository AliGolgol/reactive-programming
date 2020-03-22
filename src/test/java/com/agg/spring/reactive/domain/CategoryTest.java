package com.agg.spring.reactive.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
    Category category;

    @BeforeEach
    void setUp() {
        category=new Category();
    }

    @Test
    void getId() {
        String id="120";

        category.setId(id);
        assertEquals(id,category.getId());

    }
}
