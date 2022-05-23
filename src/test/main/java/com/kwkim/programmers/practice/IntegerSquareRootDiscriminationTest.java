package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSquareRootDiscriminationTest {

    @Test
    void solution() {
        IntegerSquareRootDiscrimination integerSquareRootDiscrimination = new IntegerSquareRootDiscrimination();

        assertAll(
                () -> assertEquals(
                        144,
                        integerSquareRootDiscrimination.solution(121)
                ),
                () -> assertEquals(
                        -1,
                        integerSquareRootDiscrimination.solution(3)
                ),
                () -> assertEquals(
                        -1,
                        integerSquareRootDiscrimination.solution(27)
                )
        );
    }
}