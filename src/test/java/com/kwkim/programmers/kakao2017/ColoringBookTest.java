package test.java.com.kwkim.programmers.kakao2017;

import main.java.com.kwkim.programmers.kakao2017.ColoringBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ColoringBookTest {

    @Test
    void doSolution() {
        ColoringBook coloringBook = new ColoringBook();

        assertAll("test",
                () -> assertArrayEquals(
                        new int[]{4, 5},
                        coloringBook.solution(6, 4,
                                new int[][]{
                                        {1, 1, 1, 0},
                                        {1, 2, 2, 0},
                                        {1, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 3},
                                        {0, 0, 0, 3}
                                }
                        )
                )
        );
    }
}