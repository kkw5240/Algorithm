package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthleteWhoCouldntFinishTest {
    @Test
    void solutionTest() {
        AthleteWhoCouldntFinish athleteWhoCouldntFinish = new AthleteWhoCouldntFinish();

        assertAll(
                () -> assertEquals(
                        "leo",
                        athleteWhoCouldntFinish.solution(
                                new String[] { "leo", "kiki", "eden" },
                                new String[] { "eden", "kiki" }
                        )
                ),() -> assertEquals(
                        "vinko",
                        athleteWhoCouldntFinish.solution(
                                new String[] { "marina", "josipa", "nikola", "vinko", "filipa" },
                                new String[] { "josipa", "filipa", "marina", "nikola" }
                        )
                ),() -> assertEquals(
                        "mislav",
                        athleteWhoCouldntFinish.solution(
                                new String[] { "mislav", "stanko", "mislav", "ana" },
                                new String[] { "stanko", "ana", "mislav" }
                        )
                )
        );
    }

}