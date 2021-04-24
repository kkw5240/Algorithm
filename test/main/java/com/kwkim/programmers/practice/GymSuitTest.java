package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    @Test
    void solution() {
        GymSuit gymSuit = new GymSuit();

        assertAll(
                () -> assertEquals(
                        5,
                        gymSuit.solution(
                                5,
                                new int[]{ 2, 4 },
                                new int[]{ 1, 3, 5 }
                        )
                ),
                () -> assertEquals(
                        4,
                        gymSuit.solution(
                                5,
                                new int[]{ 2, 4 },
                                new int[]{ 3 }
                        )
                ),
                () -> assertEquals(
                        2,
                        gymSuit.solution(
                                3,
                                new int[]{ 3 },
                                new int[]{ 1 }
                        )
                )
        );
    }
}