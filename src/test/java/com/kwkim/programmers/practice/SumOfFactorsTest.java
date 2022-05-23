package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfFactorsTest {

    @Test
    void solution() {
        SumOfFactors sumOfFactors = new SumOfFactors();

        assertAll(
                () -> assertEquals(28, sumOfFactors.solution(12)),
                () -> assertEquals(6, sumOfFactors.solution(5))
        );
    }
}