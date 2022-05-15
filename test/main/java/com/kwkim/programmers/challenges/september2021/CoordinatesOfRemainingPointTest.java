package main.java.com.kwkim.programmers.challenges.september2021;

import main.java.com.kwkim.programmers.challenges.may2021.DifferenceOfBits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesOfRemainingPointTest {

    @Test
    void solution() {
        CoordinatesOfRemainingPoint coordinatesOfRemainingPoint = new CoordinatesOfRemainingPoint();

        assertAll(
                () -> assertArrayEquals(
                        new int[]{ 1, 10 },
                        coordinatesOfRemainingPoint.solution(new int[][]{ {1, 4}, {3, 4}, {3, 10} })
                ),
                () -> assertArrayEquals(
                        new int[] { 2, 1 },
                        coordinatesOfRemainingPoint.solution(new int[][] { {1, 1}, {2, 2}, {1, 2} })
                )
        );
    }
}