package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

    @Test
    void solution() {
        Budget budget = new Budget();
        assertAll(
                () -> assertEquals(
                        3,
                        budget.solution(
                                new int[]{ 1, 3, 2, 5, 4 },
                                9
                        )
                ),
                () -> assertEquals(
                        4,
                        budget.solution(
                                new int[]{ 2, 2, 3, 3 },
                                10
                        )
                )
        );
    }
}