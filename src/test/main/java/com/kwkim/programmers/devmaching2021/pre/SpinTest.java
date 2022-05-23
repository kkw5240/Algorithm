package main.java.com.kwkim.programmers.devmaching2021.pre;

import main.java.com.kwkim.programmers.devmaching2021.pre.Spin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinTest {

    @Test
    void solutionTest() {
        Spin spin = new Spin();

        assertAll(
                () -> assertArrayEquals(
                        new int[]{ 8, 10, 25 },
                        spin.solution(
                                6, 6,
                                new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}}
                        )
                )/*, () -> assertArrayEquals(
                        new int[]{ 1, 1, 5, 3 },
                        spin.solution(
                                3, 3,
                                new int[][]{
                                        {1,1,2,2},
                                        {1,2,2,3},
                                        {2,1,3,2},
                                        {2,2,3,3}
                                }
                        )
                ), () -> assertArrayEquals(
                        new int[]{ 1 },
                        spin.solution(
                                100, 97,
                                new int[][]{{1,1,100,97}}
                        )
                )*/
        );
    }
}