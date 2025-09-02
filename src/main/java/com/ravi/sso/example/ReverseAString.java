package com.ravi.sso.example;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        int sumOfNumbers = addAll();
        System.out.println("Sum of numbers from 1 to 10: " + sumOfNumbers);
        int sumAll = enterNumber();
        System.out.println("Sum of numbers from 1 to entered number: " + sumAll);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    static String reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        String originalString = str;
        if(originalString.equals(reversedString)){
            return "Palindrome";
        }else{
            System.out.println("Not a Palindrome");
        }
        return reversedString;
    }

    static int addAll(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
    static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum += i;
        }
        return sum;
    }
}
