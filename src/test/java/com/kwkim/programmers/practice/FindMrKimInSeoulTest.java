package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMrKimInSeoulTest {

    @Test
    void solution() {
        FindMrKimInSeoul findMrKimInSeoul = new FindMrKimInSeoul();

        assertEquals(
                "김서방은 1에 있다",
                findMrKimInSeoul.solution(new String[]{ "Jane", "Kim" })
        );
    }
}