package test.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.TruckPassingTheBridge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckPassingTheBridgeTest {
    @Test
    void doSolution() {
        TruckPassingTheBridge.Solution truck = new TruckPassingTheBridge.Solution();

        assertAll(
                () -> assertEquals(
                        8,
                        truck.solution(
                                2, 10,
                                new int[] { 7,4,5,6 }
                        )
                ),
                () -> assertEquals(
                        101,
                        truck.solution(
                                100, 100,
                                new int[] { 10 }
                        )
                ),
                () -> assertEquals(
                        110,
                        truck.solution(
                                100, 100,
                                new int[] { 10,10,10,10,10,10,10,10,10,10 }
                        )
                )
        );
    }
}