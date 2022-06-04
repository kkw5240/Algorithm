package com.kwkim.leetcode.problemlist.top100likedquestions;

import java.util.HashMap;
import java.util.Map;

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
        if (s.length() == 1) {
            return 1;
        }

        Map<Integer, String> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i);

            for (int j = 0; j < subString.length(); j++) {
                char target = subString.charAt(j);

                int index = subString.indexOf(target, j+1);

                if (index == -1) {
                    result.put(subString.length(), subString);
                    break;
                }

                if (index > 0) {
                    String r = subString.substring(0, index);
                    result.put(r.length(), r);
                    break;
                }
            }

        }

        int max = 0;
        for (Integer candidate : result.keySet()) {
            if (candidate > max) {
                max = candidate;
            }
        }

        return max;
    }
}
