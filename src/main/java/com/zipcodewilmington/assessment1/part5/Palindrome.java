package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int count = 0;

        boolean[][] arr = new boolean[input.length()][input.length()];

        for (int index = 0; index < input.length(); index++) {
            arr[index][index] = true;
            count++;
        }

        for (int index = 1; index < input.length(); index++) {
            if (input.charAt(index - 1) == input.charAt(index)) {
                arr[index - 1][index] = true;
                count++;
            }
        }

        for (int index = 2; index < input.length(); index++) {
            for (int index2 = 0; index2 < index; index2++) {
                if (arr[index2 + 1][index - 1] && input.charAt(index2) == input.charAt(index)) {
                    arr[index2][index] = true;
                    count++;
                }
            }
        }
        return count;

    }
}
