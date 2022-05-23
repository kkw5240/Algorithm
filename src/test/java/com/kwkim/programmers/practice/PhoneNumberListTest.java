package com.kwkim.programmers.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneNumberListTest {
    @Test
    void solutionTest() {
        PhoneNumberList phoneNumberList = new PhoneNumberList();

        assertAll(
                () -> assertFalse(phoneNumberList.solution(new String[]{
                        "119",
                        "97674223",
                        "1195524421"
                })),
                () -> assertTrue(phoneNumberList.solution(new String[]{
                        "123",
                        "456",
                        "789"
                })),
                () -> assertFalse(phoneNumberList.solution(new String[]{
                        "12",
                        "123",
                        "1235",
                        "567",
                        "88"
                }))
        );
    }
}