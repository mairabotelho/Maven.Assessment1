package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;

        for (int num = 0; num <= n; num++){
            sum += num;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;

        for(int num = 1; num <= n; num++){
            product = product * num;
        }

        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String valString = Integer.toString(val);
        String valReverse = "";
        int numReverse;

        for(int index = valString.length() - 1; index >= 0; index--){
            valReverse += valString.charAt(index);
        }

        numReverse = Integer.valueOf(valReverse);

        return numReverse;
    }
}
