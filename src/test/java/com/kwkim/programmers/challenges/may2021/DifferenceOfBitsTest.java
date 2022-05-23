package com.kwkim.programmers.challenges.may2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceOfBitsTest {

    @Test
    void solution() {
        DifferenceOfBits differenceOfBits = new DifferenceOfBits();

        assertAll(
                () -> assertArrayEquals(
                        new long[]{ 3, 11 },
                        differenceOfBits.solution(new long[]{ 2, 7 })
                ),
                () -> assertArrayEquals(
                        new long[] { 13 },
                        differenceOfBits.solution(new long[] { 11 })
                )
        );
    }
}