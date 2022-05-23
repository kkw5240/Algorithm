package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTestTest {
    @Test
    void solutionTest() {

        assertAll(
                () -> assertArrayEquals(
                        new int[] {1},
                        new PracticeTest().solution(new int[]{ 1,2,3,4,5 })
                ),
                () -> assertArrayEquals(
                        new int[] { 1,2,3 },
                        new PracticeTest().solution(new int[]{ 1,3,2,4,2 })
                )
        );
    }

}