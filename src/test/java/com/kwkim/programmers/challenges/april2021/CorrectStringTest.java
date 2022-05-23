package com.kwkim.programmers.challenges.april2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectStringTest {

    @Test
    void solution() {
        CorrectString correctString = new CorrectString();

        assertAll(
                () -> assertEquals(
                        3,
                        correctString.solution("[](){}")
                ),
                () -> assertEquals(
                        2,
                        correctString.solution("}]()[{")
                ),
                () -> assertEquals(
                        0,
                        correctString.solution("[)(]")
                ),
                () -> assertEquals(
                        0,
                        correctString.solution("}}}")
                )
        );
    }
}