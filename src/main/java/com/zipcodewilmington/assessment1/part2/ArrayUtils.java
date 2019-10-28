package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`,
     * return the number of times the `objectToCount` appears in the `objectArray`
     */

    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;

        for(int index = 0; index < objectArray.length; index++){

            if(objectArray[index].equals(objectToCount)){
                counter++;
            }

        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`,
     * return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        List<Integer> tempList = new ArrayList<Integer>();;

        for(int index = 0; index < objectArray.length; index++) {

            if (objectArray[index] != objectToRemove){
                tempList.add((Integer) objectArray[index]);
            }
        }

        //List to Array
        Integer[] result = new Integer[tempList.size()];
        result = tempList.toArray(result);

        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        sort(objectArray);

        int currentCount = 1;
        int maxCount = 0;
        Object answer = objectArray[0];

        for (int index = 1; index <objectArray.length; index++){

            if(objectArray[index] == objectArray[index - 1]){
                currentCount++;
            }else{
                if (currentCount > maxCount){
                    maxCount = currentCount;
                    answer = objectArray[index - 1];
                }

                currentCount = 1;
            }
        }

        if(currentCount > maxCount){
            maxCount = currentCount;
            answer = objectArray[objectArray.length - 1];
        }



        return answer;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        sort(objectArray);

        int currentCount = 1;
        int minCount = 1;
        Object answer = objectArray[0];


        for (int index = 1; index <objectArray.length; index++){

            if(objectArray[index] == objectArray[index - 1]){
                currentCount++;

            }else{
                if (currentCount <= minCount){
                    minCount = currentCount;
                    answer = objectArray[index - 1];
                }

                currentCount = 1;
            }
        }

        if(currentCount <= minCount){
            minCount = currentCount;
            answer = objectArray[objectArray.length - 1];
        }

        return answer;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Integer[] mergedArray = new Integer[objectArray.length + objectArrayToAdd.length];
        int arr = 0;


            for (int index = 0; index < objectArray.length; index++) {

                mergedArray[index] = (Integer) objectArray[index];
            }

            for(int index = objectArray.length; index < mergedArray.length; index++){

                mergedArray[index] = (Integer) objectArrayToAdd[arr];
                arr++;
            }

            sort(mergedArray);

        return mergedArray;
    }
}
