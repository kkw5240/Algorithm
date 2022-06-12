package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    @Test
    void getPrev1() {
        assertEquals("ab", new LongestPalindrome().getPrev("babad", 2));
    }
    @Test
    void getPrev2() {
        assertEquals("b", new LongestPalindrome().getPrev("babad", 1));
    }
    @Test
    void getPost1() {
        assertEquals("ad", new LongestPalindrome().getPost("babad", 2));
    }
    @Test
    void getPost2() {
        assertEquals("bad", new LongestPalindrome().getPost("babad", 1));
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
