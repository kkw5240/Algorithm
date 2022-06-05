package com.kwkim.leetcode.problemlist.top100likedquestions;

/**
 * 4. Median of Two Sorted Arrays
 * Hard
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class FindMedianSortedArrays {
    public double solution(int[] nums1, int[] nums2) {
        return getMedian(mergeAndSort(nums1, nums2));
    }

    protected Integer[] mergeAndSort(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int offset1 = 0;
        int offset2 = 0;

        Integer[] mergedNums = new Integer[m + n];
        int index = 0;

        while (offset1 < m && offset2 < n) {
            if (nums1[offset1] < nums2[offset2]) {
                mergedNums[index++] = nums1[offset1++];
            } else {
                mergedNums[index++] = nums2[offset2++];
            }
        }

        for (int i = offset1; i < m; i++) {
            mergedNums[index++] = nums1[i];
        }
        for (int i = offset2; i < n; i++) {
            mergedNums[index++] = nums2[i];
        }

        return mergedNums;
    }

    protected Double getMedian(Integer[] nums) {
        int length = nums.length;
        int middleIndex = Math.round(length / 2f) - 1;

        if (isEvenLength(length)) {
            return (nums[middleIndex] + nums[middleIndex + 1]) / 2.0;
        }

        return Double.valueOf(nums[middleIndex]);
    }

    private boolean isEvenLength(int length) {
        return length % 2 == 0;
    }
}
