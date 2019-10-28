package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {

    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firsElement = stringArray[0];

        return firsElement;
    }


    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        String secondElement = stringArray[1];

        return secondElement;
    }


    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {

        String lastElement = stringArray[stringArray.length - 1];

        return lastElement;
    }


    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {

        String secondLastElement = stringArray[stringArray.length - 2];

        return secondLastElement;
    }
}
