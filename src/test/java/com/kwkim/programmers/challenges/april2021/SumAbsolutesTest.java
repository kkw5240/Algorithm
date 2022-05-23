package com.kwkim.programmers.challenges.april2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAbsolutesTest {

    @Test
    void solution() {
        SumAbsolutes sumAbsolutes = new SumAbsolutes();

        assertAll(
                () -> assertEquals(
                        9,
                        sumAbsolutes.solution(
                                new int[]{ 4, 7, 12 },
                                new boolean[]{ true, false, true }
                        )
                ),
                () -> assertEquals(
                        0,
                        sumAbsolutes.solution(
                                new int[]{ 1, 2, 3 },
                                new boolean[]{ false, false, true }
                        )
                )
        );

    }
}