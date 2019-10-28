package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {

    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String answer = Character.toUpperCase(str.charAt(0)) + str.substring(1);

        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String strReverse = "";

        for(int index = str.length() - 1; index >= 0; index--){
            strReverse = strReverse + str.charAt(index);
        }

        return strReverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String strReverse = "";

        for (int index = str.length() - 1; index >= 0; index--){
            strReverse = strReverse + str.charAt(index);
        }

        String reverseUpperCase = Character.toUpperCase(strReverse.charAt(0)) + strReverse.substring(1);

        return reverseUpperCase;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String firstLastChar = str.substring(1, str.length() - 1);

        return firstLastChar;
    }


    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String invertedCasing = "";

        for(int index = 0; index < str.length(); index++){

            if(Character.isUpperCase(str.charAt(index))){
                invertedCasing += Character.toLowerCase(str.charAt(index));

            }else if (Character.isLowerCase(str.charAt(index))){
                invertedCasing += Character.toUpperCase(str.charAt(index));

            }else if(Character.isWhitespace(str.charAt(index))){
                invertedCasing += " ";
            }
        }

        return invertedCasing;
    }
}
