package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScovilleTest {
    @Test
    void doSolution() {
        Scoville scoville = new Scoville();

        assertAll(
                () -> assertEquals(
                        2, scoville.solution(
                                new int[]{1, 2, 3, 9, 10, 12}, 7
                        )
                )
        );
    }

}