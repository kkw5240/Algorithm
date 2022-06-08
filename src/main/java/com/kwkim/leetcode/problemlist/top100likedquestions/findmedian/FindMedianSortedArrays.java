package com.kwkim.leetcode.problemlist.top100likedquestions.findmedian;

/**
 * <h1>4. Median of Two Sorted Arrays</h1>
 * Hard
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * </p>
 * <p>
 * <h2>Example 1:</h2>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * </p>
 * <p>
 * <h2>Example 2:</h2>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * </p>
 * <p>
 * <h2>Constraints:</h2>
 * <ul>
 * <li>nums1.length == m</li>
 * <li>nums2.length == n</li>
 * <li>0 <= m <= 1000</li>
 * <li>0 <= n <= 1000</li>
 * <li>1 <= m + n <= 2000</li>
 * <li>-10^6 <= nums1[i], nums2[i] <= 10^6</li>
 * </ul>
 * </p>
 */
public class FindMedianSortedArrays {
    public double solution(int[] nums1, int[] nums2) {
        return getMedian(mergeAndSort(nums1, nums2));
    }

    protected Double getMedian(Integer[] nums) {
        int length = nums.length;
        int middleIndex = Math.round(length / 2f) - 1;

        if (isEvenLength(length)) {
            return (double) (nums[middleIndex] + nums[middleIndex + 1]) / 2.0;
        }

        return Double.valueOf(nums[middleIndex]);
    }

    private boolean isEvenLength(int length) {
        return length % 2 == 0;
    }

    protected Integer[] mergeAndSort(int[] nums1, int[] nums2) {
        Numbers numbers1 = Numbers.of(nums1);
        Numbers numbers2 = Numbers.of(nums2);

        Numbers mergedNumbers = Numbers.of(
                new int[]{},
                numbers1.getLength() + numbers2.getLength()
        );

        while (numbers1.isValidOffset() && numbers2.isValidOffset()) {
            int number;
            if (numbers1.getNumber() < numbers2.getNumber()) {
                number = numbers1.getNumber();
                numbers1.increaseOffset();
            } else {
                number = numbers2.getNumber();
                numbers2.increaseOffset();
            }
            mergedNumbers.setNumber(number);
            mergedNumbers.increaseOffset();
        }

        for (int i = numbers1.getOffset(); i < numbers1.getLength(); i++) {
            mergedNumbers.setNumber(numbers1.getNumber(i));
            numbers1.increaseOffset();
            mergedNumbers.increaseOffset();
        }
        for (int i = numbers2.getOffset(); i < numbers2.getLength(); i++) {
            mergedNumbers.setNumber(numbers2.getNumber(i));
            numbers2.increaseOffset();
            mergedNumbers.increaseOffset();
        }

        return mergedNumbers.getNumbers();
    }
}

