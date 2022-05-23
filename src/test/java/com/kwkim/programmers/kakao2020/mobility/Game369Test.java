package com.kwkim.programmers.kakao2020.mobility;

import main.java.com.kwkim.programmers.kakao2020.mobility.Game369;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game369Test {
    @Test
    void doSolutions() {
        Game369 game369 = new Game369();

        assertAll("",
                () -> assertEquals(3, game369.solution(10)),
                () -> assertEquals(13, game369.solution(33)),
                () -> assertEquals(4, game369.solution(15))
        );
    }
}