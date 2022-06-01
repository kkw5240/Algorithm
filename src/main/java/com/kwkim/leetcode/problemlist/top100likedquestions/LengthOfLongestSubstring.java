package com.kwkim.leetcode.problemlist.top100likedquestions;

/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LengthOfLongestSubstring {
    public static int solution(String s) {
        return -1;
    }

    Boolean isRepeat(String chars, String key) {
        int index = chars.indexOf(key) + 1;

        if (chars.length() - 1 < index) {
            index = chars.length() - 1;
        }

        chars = chars.substring(index);
        System.out.println(chars);

        return chars.contains(key);
    }
}
