package com.ravi.sso.example;


import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char result = firstNonRepeatingCharacterMethod(str);
        System.out.println("First non-repeating character: " + result);
        input.close();
    }

    private static char firstNonRepeatingCharacterMethod(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
        for(Map.Entry<Character, Integer> entrySet: charCountMap.entrySet()){
            if(entrySet.getValue() == 1){
                return entrySet.getKey();
            }
        }

        return 0;
    }
}

