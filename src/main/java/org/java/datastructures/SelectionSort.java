package org.java.datastructures;

public class SelectionSort {

    /** algo
     * It is called selection because it selects the largest and keep pushing to the right of array
     * 9, -1, 3, 6, 26, 4, 6
     * 9 -1 -> largest as of now is at index 0 -> 9
     * 9 -1 3 6 26 4 6 -> keep moving and keep track of largest element
     * @param args
     */

    public static void main(String[] args) {

        int[] intArray = {9, -1, 3, 6, 26, 4, 6};
        for(int lastIndex = intArray.length -1 ; lastIndex > 0 ; lastIndex--){
            int largestItemIndex = 0;
            for(int i =1 ; i <=lastIndex; i++){
                if(intArray[largestItemIndex] < intArray[i])
                    largestItemIndex = i;
            }
            swap(intArray,largestItemIndex,lastIndex);
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
