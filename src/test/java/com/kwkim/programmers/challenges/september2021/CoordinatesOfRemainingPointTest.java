package com.kwkim.programmers.challenges.september2021;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CoordinatesOfRemainingPointTest {

    @SneakyThrows
    @Test
    void solution() {
        CoordinatesOfRemainingPoint coordinatesOfRemainingPoint = new CoordinatesOfRemainingPoint();

        assertAll(
                () -> assertArrayEquals(
                        new int[]{1, 10},
                        coordinatesOfRemainingPoint.solution(new int[][]{{1, 4}, {3, 4}, {3, 10}})
                ),
                () -> assertArrayEquals(
                        new int[]{2, 1},
                        coordinatesOfRemainingPoint.solution(new int[][]{{1, 1}, {2, 2}, {1, 2}})
                )
        );
    }
}