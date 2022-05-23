package main.java.com.kwkim.programmers.challenges.september2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntiCellTest {

    @Test
    void solution() {
        AntiCell antiCell = new AntiCell();

        assertAll(
                () -> assertArrayEquals(
                        new int[] { 6, 3, 1, 5, 9 },
                        antiCell.solution(
                                new int[] { 1,1,1,1,1,1,2,5,8,2,1,1,4,8,8,8,12,6,6 },
                                new int[] { 4,3,1,5,6 }
                        )
                )
        );
    }
}