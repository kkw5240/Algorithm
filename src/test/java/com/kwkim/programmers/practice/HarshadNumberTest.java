package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumberTest {

    @Test
    void solution() {
        HarshadNumber harshadNumber = new HarshadNumber();

        assertAll(
                () -> assertTrue(harshadNumber.solution(10)),
                () -> assertTrue(harshadNumber.solution(12)),
                () -> assertFalse(harshadNumber.solution(11)),
                () -> assertFalse(harshadNumber.solution(13))
        );
    }
}