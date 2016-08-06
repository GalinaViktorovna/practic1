package com.practic1.task2;

public class SumOfDigits {

    public static int toSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits = " + toSum(125987653));
    }
}
