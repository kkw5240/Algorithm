package com.kwkim.leetcode.problemlist.top100likedquestions;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Longest Palindromic Substring
 * Medium
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindrome {
    public String solution(String s) {
        if (s.length() == 1) {
            return s;
        }

        String[] ss = s.split("");

        List<String> prev = new ArrayList<>();
        for (int i = 0; i < ss.length; i++) {
            String p;
            String c;
            String n;

            c = ss[i];
            if (i == 0) {
                p = "";
            } else {
                p = ss[i-1];
            }

            if (i == ss.length-1) {
                n = "";
            } else {
                n = ss[i+1];
            }

            if (p.equals(n)) {

            } else {
                prev.add(p);
            }
        }

        return null;
    }
}
