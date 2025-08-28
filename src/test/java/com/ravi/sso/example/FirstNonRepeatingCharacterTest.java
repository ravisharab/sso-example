package com.ravi.sso.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class FirstNonRepeatingCharacterTest {
    @Autowired
    FirstNonRepeatingCharacter fnrc;

    @Test
    public void testFirstNonRepeatingCharacter() {
        String input = "swiss";
        char expected = 'w';
        char result = fnrc.firstNonRepeatingCharacterMethod(input);
        assert result == expected : "Test failed: expected " + expected + " but got " + result;
    }
}
