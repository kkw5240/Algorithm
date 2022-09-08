package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

    @Test
    void getMedianIndexTest_1() {
        assertEquals(1, new LongestPalindrome().getMedianIndex("abc"));
    }

    @Test
    void getMedianIndexTest_2() {
        assertEquals(0, new LongestPalindrome().getMedianIndex("a"));
    }

    @Test
    void getMedianIndexTest_3() {
        assertEquals(0, new LongestPalindrome().getMedianIndex("ab"));
    }

    @Test
    void getMedianIndexTest_4() {
        assertEquals(1, new LongestPalindrome().getMedianIndex("abcd"));
    }

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

    @Test
    void example4() {
        assertEquals("a", new LongestPalindrome().solution("ac"));
    }
}
