package com.kwkim.programmers.challenges.september2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfMissingNumbersTest {

    @Test
    void solution() {
        SumOfMissingNumbers sumOfMissingNumbers = new SumOfMissingNumbers();
        assertAll(
                () -> assertEquals(
                        14,
                        sumOfMissingNumbers.solution(new int[]{1,2,3,4,6,7,8,0})
                ),
                () -> assertEquals(
                        6,
                        sumOfMissingNumbers.solution(new int[]{5,8,4,0,6,7,9})
                )
        );
    }
}