package com.ravi.sso.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ReverseAStringTest {
    @Autowired
    private ReverseAString reverseAString;

    @Test
    public void testReverseAString() {
        String input = "hello";
        String expected = "olleh";
        String result = reverseAString.reverseString(input);
        assert result.equals(expected) : "Test failed: expected " + expected + " but got " + result;
    }
}
