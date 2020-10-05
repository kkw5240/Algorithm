package com.kwkim.programmers.kakao2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {

    @Test
    int solution(String s) {
        int answer = 0;

        int length = s.length();
        int offset = length / 2;

        char[] test = s.toCharArray();
        for (int i=length-1; i>=0; i--) {
            System.out.println(test[i]);
        }

        return answer;
    }

    @Test
    void doSolution() {
        assertAll("test",
                () -> assertEquals(7, solution("aabbaccc")),
                () -> assertEquals(9, solution("ababcdcdababcdcd")),
                () -> assertEquals(8, solution("abcabcdede")),
                () -> assertEquals(14, solution("abcabcabcabcdededededede")),
                () -> assertEquals(17, solution("xababcdcdababcdcd"))
        );
    }
}

//ab ca bc ab ca bc de de de de de de
//ab ca bc ab ca bc 2de 2de 2de
//ab ca bc ab ca bc 4de 2de
//ab ca bc ab ca bc 6de