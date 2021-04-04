package test.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.PickMiddleCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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