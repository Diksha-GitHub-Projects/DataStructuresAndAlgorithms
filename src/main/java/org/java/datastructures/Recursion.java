package org.java.datastructures;

public class Recursion {

    /*
     Recursive program must have base condition to stop and return the
     function call stack
     rec 0
     rec 1
     rec 2
     rec 3

     Sometimes even after base condition we get stackoverflow -> call stack get full if same function is called
     million times as it uses memory
     */
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
    }

    public static int recursiveFactorial(int num){
       if(num ==0) return 1;
       return num * (num-1);
    }
}
