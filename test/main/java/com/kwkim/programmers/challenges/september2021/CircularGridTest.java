package main.java.com.kwkim.programmers.challenges.september2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularGridTest {

    @Test
    void solution() {
        CircularGrid circularGrid = new CircularGrid();

        assertAll(
                () -> assertArrayEquals(
                        new int[]{ 16 },
                        circularGrid.solution(new String[] {"SL","LR"})
                ),
                () -> assertArrayEquals(
                        new int[]{ 1, 1, 1, 1 },
                        circularGrid.solution(new String[] {"S"})
                ),
                () -> assertArrayEquals(
                        new int[]{ 4, 4 },
                        circularGrid.solution(new String[] {"R","R"})
                )
        );
    }
}