package com.ravi.sso.example.arrayProblems;

import java.util.Arrays;
import java.util.List;

public class CommonElementsIn2Arrays {
    public static List<Integer> commonElementsIn2Arrays(int[] arr1, int[] arr2){
       return Arrays.stream(arr1).filter(arr1Element -> Arrays.stream(arr2).anyMatch(arr2Element -> arr2Element == arr1Element)).boxed().toList();

    }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.println(commonElementsIn2Arrays(arr1, arr2)); ;
    }
}
