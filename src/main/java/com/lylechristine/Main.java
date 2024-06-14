package com.lylechristine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(getMinOrZero(1, 3));
        System.out.println(getMinOrZero(11, 4));
        System.out.println(getMinOrZero(5, 8));
        System.out.println(getMinOrZero(0, 0));

        addingMethod(1, 3);

    }
    // returns 0 if a and b are equal, otherwise, it returns the smallest value of a and b
    public static int getMinOrZero(int a, int b){
        if (a == b){
            return 0;
        } else if(a < b){
            return a;
        } else {
            return b;
        }
    }

    public static int addingMethod(int a, int b){
        return a + b;
    }
}