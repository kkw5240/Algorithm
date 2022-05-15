package main.java.com.kwkim.programmers.challenges.september2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildNewCityTest {

    @Test
    void solution() {
        BuildNewCity buildNewCity = new BuildNewCity();

        assertAll(
                () -> assertEquals(
                        50,
                        buildNewCity.solution(10, 10, new int[]{100}, new int[]{100}, new int[]{7}, new int[]{10})
                ),
                () -> assertEquals(
                        499,
                        buildNewCity.solution(90, 500, new int[]{70,70,0}, new int[]{0,0,500}, new int[]{100,100,2}, new int[]{4,8,1})
                )
        );
    }
}