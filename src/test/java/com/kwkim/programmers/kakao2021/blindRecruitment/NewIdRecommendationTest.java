package com.kwkim.programmers.kakao2021.blindRecruitment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewIdRecommendationTest {

    @Test
    void solution() {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();

        assertAll(
                () -> assertEquals(
                        "bat.y.abcdefghi",
                        newIdRecommendation.solution("...!@BaT#*..y.abcdefghijklm")
                ),
                () -> assertEquals(
                        "z--",
                        newIdRecommendation.solution("z-+.^.")
                ),
                () -> assertEquals(
                        "aaa",
                        newIdRecommendation.solution("=.=")
                ),
                () -> assertEquals(
                        "123_.def",
                        newIdRecommendation.solution("123_.def")
                ),
                () -> assertEquals(
                        "abcdefghijklmn",
                        newIdRecommendation.solution("abcdefghijklmn.p")
                )
        );
    }
}