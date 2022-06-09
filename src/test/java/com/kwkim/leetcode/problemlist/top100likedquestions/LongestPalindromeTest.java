package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    @Test
    void example1() {
        assertEquals("bab", new LongestPalindrome().solution("babad"));
    }

    @Test
    void example2() {
        assertEquals("bb", new LongestPalindrome().solution("cbbd"));
    }

    @Test
    void example3() {
        assertEquals("b", new LongestPalindrome().solution("b"));
    }
}
