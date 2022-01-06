package org.java.datastructures;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {9, -1, 3, 6, 26, 4, 6};
        /*
         shell sort work on gap value which is comparing values at a gap not the next to each other
         it performs better than insertion sort and uses insertion sort at the last when gap values becomes 0
         */

        for(int gap=intArray.length/2 ; gap > 0 ; gap /=2){

            for(int i=gap ; i < intArray.length ; i++)
            {

            }

        }
    }
}
