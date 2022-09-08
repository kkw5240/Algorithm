package com.kwkim.leetcode.problemlist.top100likedquestions;

/**
 * 5. Longest Palindromic Substring
 * Medium
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindrome {
    public String solution(String s) {
        return null;
    }

    public int getMedianIndex(String input) {
        int length = input.length();

        if (length < 2) {
            return 0;
        }

        return (int) Math.round(length / 2.0) - 1;
    }
}
