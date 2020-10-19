package test.java.com.kwkim.programmers.practice;


import main.java.com.kwkim.programmers.practice.NumberOf124Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NumberOf124CountryTest {

    String solution(int n) {
        String[] ns = { "1", "2", "4", "11", "12", "14", "21", "22", "24" };

        if (n < 10) {
            return ns[n-1];
        }

        return solution((n-1)/3) + ns[(n-1)%3];
    }

    @Test
    void do64Solution() {
        assertEquals("1441", solution(64));
    }

    @Test
    void doTestSolution() {
        assertAll("testTestCodes",
                () -> assertEquals("1", solution(1)),
                () -> assertEquals("2", solution(2)),
                () -> assertEquals("4", solution(3)),
                () -> assertEquals("11", solution(4)),
                () -> assertEquals("12", solution(5)),
                () -> assertEquals("14", solution(6)),
                () -> assertEquals("21", solution(7)),
                () -> assertEquals("22", solution(8)),
                () -> assertEquals("24", solution(9)),
                () -> assertEquals("41", solution(10)),
                () -> assertEquals("1441", solution(64)),
                () -> assertEquals("4141", solution(100)),
                () -> assertEquals("12111", solution(148)),
                () -> assertEquals("12112", solution(149)),
                () -> assertEquals("12114", solution(150))
        );
    }

    @Test
    void doSolution() {
        NumberOf124Country numberOf124Country = new NumberOf124Country();
        assertAll("testSolutions",
                () -> assertEquals("1", numberOf124Country.solution(1)),
                () -> assertEquals("2", numberOf124Country.solution(2)),
                () -> assertEquals("4", numberOf124Country.solution(3)),
                () -> assertEquals("11", numberOf124Country.solution(4)),
                () -> assertEquals("12", numberOf124Country.solution(5)),
                () -> assertEquals("14", numberOf124Country.solution(6)),
                () -> assertEquals("21", numberOf124Country.solution(7)),
                () -> assertEquals("22", numberOf124Country.solution(8)),
                () -> assertEquals("24", numberOf124Country.solution(9)),
                () -> assertEquals("41", numberOf124Country.solution(10))
        );
    }
}