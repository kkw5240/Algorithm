package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLongestSubstringTest {

    @Test
    void example1() {
        assertEquals(3, new LengthOfLongestSubstring().solution("abcabcbb"));
    }

    @Test
    void example2() {
        assertEquals(1, new LengthOfLongestSubstring().solution("bbbbb"));
    }

    @Test
    void example3() {
        assertEquals(3, new LengthOfLongestSubstring().solution("pwwkew"));
    }

    @Test
    void example4() {
        assertEquals(1, new LengthOfLongestSubstring().solution(" "));
    }

    @Test
    void example5() {
        assertEquals(2, new LengthOfLongestSubstring().solution("aab"));
    }
}