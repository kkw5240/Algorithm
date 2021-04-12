package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTestTest {
    @Test
    void solutionTest() {

        PracticeTest practiceTest = new PracticeTest();

        assertAll(
                () -> assertArrayEquals(
                        new int[] {1},
                        practiceTest.solution(new int[]{ 1,2,3,4,5 })
                ),
                () -> assertArrayEquals(
                        new int[] { 1,2,3 },
                        practiceTest.solution(new int[]{ 1,3,2,4,2 })
                )
        );
    }

}