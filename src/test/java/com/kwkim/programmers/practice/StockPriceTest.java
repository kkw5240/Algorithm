package test.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.StockPrice;
import main.java.com.kwkim.programmers.practice.TriangularSnail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPriceTest {
    @Test
    public void doSolution() {
        StockPrice stockPrice = new StockPrice();

        assertAll("test",
                () -> assertArrayEquals(
                        new int[]{4, 3, 1, 1, 0},
                        stockPrice.solution(new int[]{1, 2, 3, 2, 3})
                )
        );
    }
}