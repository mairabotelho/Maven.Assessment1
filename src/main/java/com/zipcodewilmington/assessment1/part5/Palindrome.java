package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        String test = "";
        int countSub = input.length();

        for(int index = 0; index < input.length(); index++){
            for(int index2 = index + 2; index2 <= input.length(); index2++){

                test = input.substring(index, index2);
                countSub++;
            }
        }

        return countSub;

    }
}
