package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TernaryReversalTest {

    @Test
    void solution() {
        TernaryReversal ternaryReversal = new TernaryReversal();

        assertAll(
                () -> assertEquals(7, ternaryReversal.solution(45)),
                () -> assertEquals(229, ternaryReversal.solution(125))
        );
    }
}