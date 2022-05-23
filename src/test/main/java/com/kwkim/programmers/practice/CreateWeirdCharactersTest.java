package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateWeirdCharactersTest {

    @Test
    void solution() {
        CreateWeirdCharacters createWeirdCharacters = new CreateWeirdCharacters();

        assertEquals(
                "TrY HeLlO WoRlD",
                createWeirdCharacters.solution("try hello world")
        );

    }
}