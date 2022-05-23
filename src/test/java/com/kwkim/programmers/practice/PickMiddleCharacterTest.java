package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PickMiddleCharacterTest {
    @Test
    public void solutionTest() {
        PickMiddleCharacter pickMiddleCharacter = new PickMiddleCharacter();

        assertAll(
                () -> assertEquals("c", pickMiddleCharacter.solution("abcde")),
                () -> assertEquals("we", pickMiddleCharacter.solution("qwer"))
        );

    }
}