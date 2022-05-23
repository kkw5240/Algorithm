package main.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.Printer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrinterTest {
    @Test
    void doSolution() {
        Printer.Solution printer = new Printer.Solution();

        assertAll(
                () -> assertEquals(
                        1,
                        printer.solution(
                                new int[] { 2, 1, 3, 2 }, 2
                        )
                ),
                () -> assertEquals(
                        5,
                        printer.solution(
                                new int[] { 1, 1, 9, 1, 1, 1 }, 0
                        )
                )
        );
    }
}