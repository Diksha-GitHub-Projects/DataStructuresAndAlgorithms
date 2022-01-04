package org.java.datastructures;

public class ArrayExample {

    public static void main(String[] args) {
        // Arrays have fixed length , they are not dynamic in nature
        int[] intArray = new int[4];

        // Arrays are index based and index starts from 0
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;

        for(int arrVal : intArray) {
            System.out.println(arrVal);
        }

        // traditional way of accessing array values
        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

}
