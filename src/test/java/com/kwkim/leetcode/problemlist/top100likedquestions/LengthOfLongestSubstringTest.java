package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LengthOfLongestSubstringTest {

    @Test
    void example1() {
        assertEquals(3, LengthOfLongestSubstring.solution("abcabcbb"));
    }

    @Test
    void example2() {
        assertEquals(1, LengthOfLongestSubstring.solution("bbbbb"));
    }

    @Test
    void example3() {
        assertEquals(3, LengthOfLongestSubstring.solution("pwwkew"));
    }
}