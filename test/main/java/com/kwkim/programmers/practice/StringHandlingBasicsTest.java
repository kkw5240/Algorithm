package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHandlingBasicsTest {

    @Test
    void solution() {
        StringHandlingBasics stringHandlingBasics = new StringHandlingBasics();

        assertAll(
                () -> assertFalse(stringHandlingBasics.solution("a234")),
                () -> assertTrue(stringHandlingBasics.solution("1234"))
        );
    }
}