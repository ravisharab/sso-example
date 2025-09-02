package com.ravi.sso.example.arrayProblems;

import java.util.Arrays;

public class SecondSmallestNumberInArray {
    public static int secondSmallestNumber(int[] intArray) {
        return Arrays.stream(intArray).distinct().sorted().skip(1).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        secondSmallestNumber(numbers);
        System.out.println("Second smallest number: " + secondSmallestNumber(numbers));

    }
}
