package com.example.newProject.coreJava;

public class Febonocci {

    public static void main (String[] args){
        printFebonocciSeries(10);
    }

    private static void printFebonocciSeries(int items) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < items; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    private static void isThisFebenocci(int n) {
        int first = 0;
        int second = 1;
        for (int i=0; i<n; i++){
            System.out.print(second+" ");
            int next = first+second;
            first = second;
            second = next;

        }
    }
}
