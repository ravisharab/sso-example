package com.ravi.sso.example;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    private static String reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        String originalString = str;
        if(originalString.equals(reversedString)){
            return "Palindrome";
        }else{
            System.out.println("Not a Palindrome");
        }
        return reversedString;
    }
}
