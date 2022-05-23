package main.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.PickTwoAndAdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PickTwoAndAddTest {
    @Test
    void doSolution() {
        PickTwoAndAdd pickTwoAndAdd = new PickTwoAndAdd();

        assertAll(
                () -> assertArrayEquals(
                        new int[] {2,3,4,5,6,7},
                        pickTwoAndAdd.solution(
                                new int[] {2,1,3,4,1}
                        )
                ),
                () -> assertArrayEquals(
                        new int[] {2,5,7,9,12},
                        pickTwoAndAdd.solution(
                            new int[] {5,0,2,7}
                        )
                )
        );
    }
}