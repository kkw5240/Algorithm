package com.kwkim.programmers.kakao2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {

    @Test
    int solution(String s) {
        int length = s.length();
        int mid = length / 2;
        int answer = length;

        StringBuilder compressedString;
        String currString;
        String prevString;
        String compressedWord;
        int counter;

        for (int i=1; i<=mid; i++) {
            counter = 1;
            compressedString = new StringBuilder();
            currString = "";
            prevString = "";

            for (int j=0; j<length; j+=i) {
                currString = s.substring(j, Math.min(i+j, length));
                if (currString.equals(prevString)) {
                    counter++;
                    continue;
                }

                compressedWord = counter > 1 ? counter + prevString : prevString;
                compressedString.append(compressedWord);
                counter = 1;

                prevString = currString;
            }

            compressedWord = counter > 1 ? counter + currString : currString;
            compressedString.append(compressedWord);

            answer = Math.min(compressedString.length(), answer);
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