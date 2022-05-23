package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {

    @Test
    void solution() {
        Watermelon watermelon = new Watermelon();

        assertAll(
                () -> assertEquals(
                        "수박수",
                        watermelon.solution(3)
                ),
                () -> assertEquals(
                        "수박수박",
                        watermelon.solution(4)
                )
        );
    }
}