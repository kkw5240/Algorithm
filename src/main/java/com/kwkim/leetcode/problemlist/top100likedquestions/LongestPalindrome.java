package com.kwkim.leetcode.problemlist.top100likedquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        System.out.println("[" + s + "]");

        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            String prev = getPrev(s, i);
            String post = getPost(s, i);

            printTemporary(prev, post);

            StringBuilder result = new StringBuilder();
            int minLength = Math.min(prev.length(), post.length());
            for (int j = 0; j < minLength; j++) {
                if (prev.charAt(j) != post.charAt(j)) {
                    if (prev.charAt(j) == s.charAt(i)) {
                        result.append(prev.charAt(j));
                        result.append(s.charAt(i));
                    }

                    if (post.charAt(j) == s.charAt(i)) {
                        result.append(s.charAt(i));
                        result.append(post.charAt(j));
                    }

                    break;
                }

                result.append(prev.charAt(j));
                result.append(s.charAt(i));
                result.append(post.charAt(j));
            }
            System.out.println("\t" + result);
        }

        return null;
    }

    String getPrev(String s, int i) {
        List<String> prev = new ArrayList<>(Arrays.asList(
                s.substring(0, i).split("")
        ));

        Collections.reverse(prev);

        return String.join("", prev);
    }

    String getPost(String s, int i) {
        return s.substring(i + 1);
    }


    private void printTemporary(String prev, String post) {
        System.out.println(prev + " - " + post);
        System.out.println();
        System.out.println();
    }
}
