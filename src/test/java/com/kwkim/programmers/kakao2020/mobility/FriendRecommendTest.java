package com.kwkim.programmers.kakao2020.mobility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FriendRecommendTest {
    @Test
    void doSolutions() {
        FriendRecommend fr = new FriendRecommend();

        assertAll("",
                () -> assertArrayEquals(new String[]{"james"},
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
                () -> assertArrayEquals(new String[]{"david", "james"},
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