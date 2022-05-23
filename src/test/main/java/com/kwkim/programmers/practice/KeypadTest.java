package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KeypadTest {

    @Test
    void solution() {
        assertAll(
                () -> assertEquals("LRLLLRLLRRL",
                        new Keypad().solution(
                                new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 },
                                "right"
                        )
                ),
                () -> assertEquals("LRLLRRLLLRR",
                        new Keypad().solution(
                                new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 },
                                "left"
                        )
                ),
                () -> assertEquals("LLRLLRLLRL",
                        new Keypad().solution(
                                new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },
                                "right"
                        )
                )
        );
    }
}