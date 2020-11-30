package test.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.ProgressSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressSpeedTest {
    @Test
    void doSolution() {
        ProgressSpeed progressSpeed = new ProgressSpeed();

        assertAll(
                () -> assertArrayEquals(
                        new int[] { 2, 1 },
                        progressSpeed.solution(
                                new int[]{ 93, 30, 55 },
                                new int[]{ 1, 30, 5 }
                        )
                ),
                () -> assertArrayEquals(
                        new int[]{ 1, 3, 2 },
                        progressSpeed.solution(
                                new int[]{ 95, 90, 99, 99, 80, 99 },
                                new int[]{ 1, 1, 1, 1, 1, 1 }
                        )
                )
        );
    }
}