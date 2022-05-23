package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    @Test
    void solution() {
        GymSuit gymSuit = new GymSuit();

        assertAll(
                () -> assertEquals(
                        5,
                        gymSuit.solution(
                                5,
                                new int[]{ 2, 4 },
                                new int[]{ 1, 3, 5 }
                        )
                ),
                () -> assertEquals(
                        4,
                        gymSuit.solution(
                                5,
                                new int[]{ 2, 4 },
                                new int[]{ 3 }
                        )
                ),
                () -> assertEquals(
                        2,
                        gymSuit.solution(
                                3,
                                new int[]{ 3 },
                                new int[]{ 1 }
                        )
                ),
                () -> assertEquals(
                        2,
                        gymSuit.solution(
                                3,
                                new int[]{ 1, 2 },
                                new int[]{ 3 }
                        )
                ),
                () -> assertEquals(
                        2,
                        gymSuit.solution(
                                2,
                                new int[]{ 2 },
                                new int[]{ 2 }
                        )
                ),
                () -> assertEquals(
                        4,
                        gymSuit.solution(
                                4,
                                new int[]{ 4, 2 },
                                new int[]{ 1, 3 }
                        )
                ),
                () -> assertEquals(
                        4,
                        gymSuit.solution(
                                4,
                                new int[]{ 3, 1 },
                                new int[]{ 2, 4 }
                        )
                ),
                () -> assertEquals(
                        6,
                        gymSuit.solution(
                                12,
                                new int[]{ 1, 2, 3, 4, 8, 9, 10, 11 },
                                new int[]{ 9, 10 }
                        )
                ),
                () -> assertEquals(
                        2,
                        gymSuit.solution(
                                2,
                                new int[]{ 1 },
                                new int[]{ 2 }
                        )
                ),
                () -> assertEquals(
                        3,
                        gymSuit.solution(
                                4,
                                new int[]{ 3, 1, 2 },
                                new int[]{ 2, 4, 3 }
                        )
                ),
                () -> assertEquals(
                        27,
                        gymSuit.solution(
                                27,
                                new int[]{ 10,16,19,20,24,26,27 },
                                new int[]{ 4,7,8,10,13,14,16,17,18,19,21,22,23,24,25,26,27 }
                        )
                ),
                () -> assertEquals(
                        4,
                        gymSuit.solution(
                                5,
                                new int[]{ 2,3,4 },
                                new int[]{ 3,4,5 }
                        )
                ),
                () -> assertEquals(
                        10,
                        gymSuit.solution(
                                11,
                                new int[]{ 1, 3, 2, 5 },
                                new int[]{ 1, 2, 5, 7, 9 }
                        )
                ),
                () -> assertEquals(
                        7,
                        gymSuit.solution(
                                8,
                                new int[]{ 5, 6 },
                                new int[]{ 4, 5 }
                        )
                )
        );
    }
}