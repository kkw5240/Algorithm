package main.java.com.kwkim.programmers.challenges.may2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfFactorsTest {

    @Test
    void solution() {
        SumOfFactors sumOfFactors = new SumOfFactors();

        assertAll(
                () -> assertEquals(43, sumOfFactors.solution(13, 17)),
                () -> assertEquals(52, sumOfFactors.solution(24, 27))
        );
    }
}