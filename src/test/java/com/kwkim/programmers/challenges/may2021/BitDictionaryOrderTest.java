package com.kwkim.programmers.challenges.may2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitDictionaryOrderTest {

    @Test
    void solution() {
        BitDictionaryOrder bitDictionaryOrder = new BitDictionaryOrder();

        assertArrayEquals(
                new String[]{
                        "1101", "100110110", "0110110111"
                },
                bitDictionaryOrder.solution(new String[] {
                        "1110", "100111100", "0111111010"
                })
        );
    }
}