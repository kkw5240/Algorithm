package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

class SumBetweenTwoIntegersTest {

    @Test
    void solution() {
        SumBetweenTwoIntegers sumBetweenTwoIntegers = new SumBetweenTwoIntegers();
        assertAll(
                () -> assertEquals(12, sumBetweenTwoIntegers.solution(3, 5)),
                () -> assertEquals(3,  sumBetweenTwoIntegers.solution(3, 3)),
                () -> assertEquals(12, sumBetweenTwoIntegers.solution(5, 3))
        );
    }
}