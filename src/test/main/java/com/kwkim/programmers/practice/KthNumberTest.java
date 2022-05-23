package main.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.KthNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumberTest {

    @Test
    void solutionTest() {
        KthNumber kthNumber = new KthNumber();

        assertArrayEquals(
                new int[] {5, 6, 3},
                kthNumber.solution(
                        new int[]{ 1, 5, 2, 6, 3, 7, 4 },
                        new int[][] {
                                { 2, 5, 3 },
                                { 4, 4, 1 },
                                { 1, 7, 3 }
                        })
        );
    }

}