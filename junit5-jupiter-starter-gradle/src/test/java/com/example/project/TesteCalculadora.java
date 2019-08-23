package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.*;

class TesteCalculadora {

    private final Calculator calculator = new Calculator();
    @Test
    @DisplayName("1+1=0")
    void adicao() {
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    @DisplayName("1-1=0")
    void subtracao() {
        assertEquals(0, calculator.sub(1, 1));
    }
    @Test
    @DisplayName("2*2=4")
    void multiplicacao() {
        assertEquals(4, calculator.mult(2, 2));
    }
    @Test
    @DisplayName("2/2=1")
    void divisao() {
        assertEquals(1, calculator.div(2, 2));
    }

}
