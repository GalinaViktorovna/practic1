package com.practic1.task4;

public class MaxNumber {

    public static double toCalculate(double[] arrayWithNumbers) {
        double maxNumber = arrayWithNumbers[0];
        for (double number : arrayWithNumbers
                ) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        double[] arrayWithNumbers = {1003, 34, 233, 433, 233.9, 0, 123};
        System.out.println("Max number is : " + toCalculate(arrayWithNumbers));
    }

}
