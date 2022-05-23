package main.java.com.kwkim.programmers.devmaching2021.pre;

import main.java.com.kwkim.programmers.devmaching2021.pre.Lotto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    @Test
    void testSolution() {
        Lotto lotto = new Lotto();

        assertAll(
                () -> assertArrayEquals(
                        new int[] { 3, 5 },
                        lotto.solution(
                                new int[] { 44, 1, 0, 0, 31, 25 },
                                new int[] { 31, 10, 45, 1, 6, 19 }
                         )
                ),() -> assertArrayEquals(
                        new int[] { 1, 6 },
                        lotto.solution(
                                new int[] { 0, 0, 0, 0, 0, 0 },
                                new int[] { 38, 19, 20, 40, 15, 25 }
                         )
                ),() -> assertArrayEquals(
                        new int[] { 1, 1 },
                        lotto.solution(
                                new int[] { 45, 4, 35, 20, 3, 9 },
                                new int[] { 20, 9, 3, 45, 4, 35 }
                         )
                )
        );
    }
}