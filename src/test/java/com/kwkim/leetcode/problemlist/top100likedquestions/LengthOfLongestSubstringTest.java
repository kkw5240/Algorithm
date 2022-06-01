package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void isRepeat1() {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        assertTrue(test.isRepeat("abcabcbb","abc"));
    }

    @Test
    void isRepeat2() {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        assertTrue(test.isRepeat("bbbbb","b"));
    }

    @Test
    void isRepeat3() {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        assertTrue(test.isRepeat("pwwkew","wke"));
    }

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