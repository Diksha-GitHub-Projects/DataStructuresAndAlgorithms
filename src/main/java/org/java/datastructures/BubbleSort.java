package org.java.datastructures;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {9, -1, 3, 6, 26, 4, 6};
        /**
         * Algo
         * 9 -1 3 6 26 4 6
         * -1 9 3 6 26 4 6
         * -1 3 9 6 26 4 6
         * -1 3 6 9 26 4 6
         * -1 3 6 9 4 26 6
         * -1 3 6 9 4 6 26
         * again start from index 0 and start moving big elements to the end of array
         */
        for (int lastIndex = intArray.length - 1; lastIndex > 0 ; lastIndex --){
            for(int i = 0 ; i < lastIndex ; i++){
                if(intArray[i] > intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }
        for(int values: intArray){
            System.out.println(values);
        }
    }

    public static void swap(int[] intArray, int i, int j){
        if(intArray[i] == intArray[j])
            return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
