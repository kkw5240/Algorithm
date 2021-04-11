package main.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.PhoneNumberList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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