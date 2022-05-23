package com.kwkim.programmers.kakao2020.mobility;

import main.java.com.kwkim.programmers.kakao2020.mobility.FriendRecommend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendRecommendTest {
    @Test
    void doSolutions() {
        FriendRecommend fr = new FriendRecommend();

        assertAll("",
                () -> assertEquals(new String[]{"james"},
                        fr.solution(
                                new String[][]{
                                        {"david", "frank"},
                                        {"demi", "david"},
                                        {"frank", "james"},
                                        {"demi", "james"},
                                        {"claire", "frank"}
                                },
                                "david"
                        )),
                () -> assertEquals(new String[]{"david","james"},
                        fr.solution(
                                new String[][]{
                                        {"david", "demi"},
                                        {"frank", "demi"},
                                        {"demi", "james"}
                                },
                                "frank"
                        ))
        );
    }
}