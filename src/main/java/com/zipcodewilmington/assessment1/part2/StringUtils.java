package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence,
     * return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        List<String> listTemp = new ArrayList<>();

        for(String word : sentence.split(" ")){
            listTemp.add(word);

        }

        String[] result = listTemp.toArray(new String[0]);

        return result;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {


        String[] firstWord = sentence.split(" ");

        return firstWord[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] firstWord = sentence.split(" ");
        String word = firstWord[0];
        String wordReverse = "";

        for(int index = word.length() - 1; index >= 0; index--) {
            wordReverse += word.charAt(index);
        }

        return wordReverse;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] firstWord = sentence.split(" ");
        String word = firstWord[0];
        String wordReverse = "";

        for(int index = word.length() - 1; index >= 0; index--) {
            wordReverse += word.charAt(index);
        }

        String answer = Character.toUpperCase(wordReverse.charAt(0)) + wordReverse.substring(1);

        return answer;

    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        String result = str.substring(0, index) + str.substring(index + 1);

        return result;
    }

}
