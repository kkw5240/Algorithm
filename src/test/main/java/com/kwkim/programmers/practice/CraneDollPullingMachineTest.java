package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CraneDollPullingMachineTest {

    @Test
    void solution() {
        CraneDollPullingMachine craneDollPullingMachine = new CraneDollPullingMachine();

        assertAll(
                () -> assertEquals(
                        4,
                        craneDollPullingMachine.solution(
                                new int[][]{
                                        { 0, 0, 0, 0, 0 },
                                        { 0, 0, 1, 0, 3 },
                                        { 0, 2, 5, 0, 1 },
                                        { 4, 2, 4, 4, 2 },
                                        { 3, 5, 1, 3, 1 }
                                },
                                new int[]{ 1, 5, 3, 5, 1, 2, 1, 4 }
                        )
                ),
                () -> assertEquals(
                        8,
                        craneDollPullingMachine.solution(
                                new int[][]{
                                        { 1, 1, 1 },
                                        { 1, 1, 1 },
                                        { 1, 1, 1 }
                                },
                                new int[]{
                                        1, 1, 1,
                                        2, 2, 2,
                                        3, 3, 3
                                }
                        )
                ),
                () -> assertEquals(
                        24,
                        craneDollPullingMachine.solution(
                                new int[][]{
                                        { 1, 1, 1, 1, 1 },
                                        { 1, 1, 1, 1, 1 },
                                        { 1, 1, 1, 1, 1 },
                                        { 1, 1, 1, 1, 1 },
                                        { 1, 1, 1, 1, 1 }
                                },
                                new int[]{
                                        1, 1, 1, 1, 1,
                                        2, 2, 2, 2, 2,
                                        3, 3, 3, 3, 3,
                                        4, 4, 4, 4, 4,
                                        5, 5, 5, 5, 5
                                }
                        )
                )
        );


    }
}