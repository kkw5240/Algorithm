package com.kwkim.leetcode.problemlist.top100likedquestions.findmedian;

public class Numbers {
    private Integer[] numbers;
    private final int length;
    private int offset;

    private Numbers(Integer[] numbers) {
        this.numbers = numbers;
        this.length = numbers.length;
        this.offset = 0;
    }

    private Numbers(Integer[] numbers, int length) {
        this.numbers = numbers;
        this.length = length;
        this.offset = 0;
    }

    public static Numbers of(int[] nums) {
        Integer[] numbers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
        }
        return new Numbers(numbers);
    }

    public static Numbers of(int[] nums, int length) {
        Integer[] numbers = new Integer[length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
        }
        return new Numbers(numbers, length);
    }

    public Integer[] getNumbers() {
        return this.numbers;
    }

    public int getNumber(int index) {
        return this.numbers[index];
    }

    public int getNumber() {
        return getNumber(this.offset);
    }

    public void setNumber(Integer index, Integer number) {
        this.numbers[index] = number;
    }

    public void setNumber(Integer number) {
        this.setNumber(this.offset, number);
    }

    public int getLength() {
        return length;
    }

    public int getOffset() {
        return offset;
    }

    public void increaseOffset() {
        this.offset++;
    }

    public Boolean isValidOffset() {
        return this.offset < this.length;
    }
}
