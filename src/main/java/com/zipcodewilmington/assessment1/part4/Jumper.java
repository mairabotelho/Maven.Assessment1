package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpsInHeight = 0;
        int remaninder = 0;


        if(k == j){
            return 1;

        }else if(k > j){
            jumpsInHeight = k / j;
            remaninder = k % j;

            return jumpsInHeight + remaninder;

        }

            return k;

    }
}
