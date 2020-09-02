package com.supra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String testCases = s.nextLine();
            int tests = Integer.parseInt(testCases);

            s = new Scanner(System.in);
            String combo = s.nextLine();
            String[] comboArray = combo.split(" ");
            int arraySize = Integer.parseInt(comboArray[0]);
            int noOfSteps = Integer.parseInt(comboArray[1]);

            s = new Scanner(System.in);
            String array = s.nextLine();
            String[] arrayElements = array.split(" ");
            int[] actualArray = new int[arrayElements.length];
            for(int i=0;i<arrayElements.length;i++) {
                actualArray[i] = Integer.parseInt(arrayElements[i]);
            }

            int[] outputArray = doRotations(actualArray, noOfSteps);


        } catch(Exception e) {
            System.out.println("Enter only numbers");
        }
    }

    private static int[] doRotations(int[] actualArray, int noOfSteps) {

        int[] tempArray = new int[actualArray.length];
        for(int i = 1; i <= noOfSteps%(actualArray.length); i ++) {
            for(int j = 0 ; j < actualArray.length; j ++) {

            }
        }

        return tempArray;
    }
}
