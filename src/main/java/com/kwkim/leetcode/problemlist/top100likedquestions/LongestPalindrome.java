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
        if (isSingleCharString(s)) {
            return s;
        }

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String prev = getPrev(s, i);
            String post = getPost(s, i);

            StringBuilder tempResult = new StringBuilder();
            int minLength = Math.min(prev.length(), post.length());
            for (int j = 0; j < minLength; j++) {
                if (prev.charAt(j) != post.charAt(j)) {
                    if (tempResult.length() == 0) {
                        if (prev.charAt(j) == s.charAt(i)) {
                            tempResult.append(prev.charAt(j));
                            tempResult.append(s.charAt(i));
                            break;
                        }

                        if (post.charAt(j) == s.charAt(i)) {
                            tempResult.append(s.charAt(i));
                            tempResult.append(post.charAt(j));
                            break;
                        }

                        tempResult.append(s.charAt(i));
                    }

                    break;
                }

                tempResult.append(prev.charAt(j));
                tempResult.append(s.charAt(i));
                tempResult.append(post.charAt(j));
            }

            if (result.length() < tempResult.length()) {
                result = tempResult.toString();
            }
        }

        return result;
    }

    private boolean isSingleCharString(String s) {
        return s.length() == 1;
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
}
