package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sumIntegers = 0;

        for(int index = 0; index < intArray.length; index++){

            sumIntegers += intArray[index];
        }

        return sumIntegers;
    }


    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;

        for(int index = 1; index < intArray.length; index ++){

            product = product * intArray[index];
        }

        return product;
    }


    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sumIntegers = 0;

        for(int index = 0; index < intArray.length; index++){

            sumIntegers += intArray[index];
        }

        double average =  ((double) sumIntegers / intArray.length);
        return average;
    }
}
