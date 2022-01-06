package org.java.datastructures;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {9, -1, 3, 6, 26, 4, 6};
        // -1 9 3 6 26 4 6
        // -1 3 9 6 26 4 6
        // -1 3 6 9 26 4 6
        // -1 3 6 9 4 26 6
        // -1 3 6 9 4 6 26
        for (int i = 1; i < intArray.length; i++)
        {
            int j = i-1;
            int key = intArray[i];
            while(j >= 0 && intArray[j] > key){
                    intArray[j+1] = intArray[j];
                j -= 1;
            }
            intArray[j+1] = key;
        }
        for(int values : intArray){
            System.out.println(values);
        }
    }
}
