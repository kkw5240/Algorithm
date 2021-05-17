package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureRateTest {

    @Test
    void solution() {
        FailureRate failureRate = new FailureRate();

        assertAll(
                () -> assertArrayEquals(
                        new int[] { 3, 4, 2, 1, 5 },
                        failureRate.solution(
                                5,
                                new int[] { 2, 1, 2, 6, 2, 4, 3, 3 }
                        )
                )/*,
                () -> assertArrayEquals(
                        new int[] { 4, 1, 2, 3 },
                        failureRate.solution(
                                4,
                                new int[] { 4, 4, 4, 4, 4 }
                        )
                )*/
        );
    }
}