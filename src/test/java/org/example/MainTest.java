package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
     void setUp() {
    }

    @Test
    void index() {
        Main main = new Main();
        assertEquals(0, main.index());
    }
}