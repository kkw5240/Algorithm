package main.java.com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonecketmonTest {

    @Test
    void solution() {
        Phonecketmon phonecketmon = new Phonecketmon();

        assertAll(
                () -> assertEquals(2,
                        phonecketmon.solution(new int[]{ 3, 1, 2, 3 })
                ),
                () -> assertEquals(3,
                        phonecketmon.solution(new int[]{ 3, 3, 3, 2, 2, 4 })
                ),
                () -> assertEquals(2,
                        phonecketmon.solution(new int[]{ 3, 3, 3, 2, 2, 2 })
                )
        );
    }
}