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

    private final Map<Character, Integer> characterMap = new HashMap<>();
    private String substring;
    private int max = 0;
    private int offset = 0;

    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }

        this.substring = s;

        return findMaxLengthOfNoneRepeatedSubstring();
    }

    private int findMaxLengthOfNoneRepeatedSubstring() {
        int length = substring.length();

        for (int i = 0; i < length; i++) {
            offset = calculateOffset(i);

            putCharacterAt(i);

            max = getMaxLength(i);
        }

        return max;
    }

    private Integer calculateOffset(int i) {
        if (isRepeatCharacter(substring.charAt(i))) {
            offset = characterMap.get(substring.charAt(i)) + 1;
        }

        return offset;
    }

    private boolean isRepeatCharacter(Character character) {
        return isExistCharacter(character) && isIndexOfCharacterGreaterThenOffset(character);
    }

    private boolean isIndexOfCharacterGreaterThenOffset(Character target) {
        return this.characterMap.get(target) >= offset;
    }

    private boolean isExistCharacter(Character target) {
        return this.characterMap.get(target) != null;
    }

    private void putCharacterAt(int i) {
        this.characterMap.put(substring.charAt(i), i);
    }

    private int getMaxLength(int i) {
        return Math.max(max, i - offset + 1);
    }

}
