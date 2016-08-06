package com.practic1.task1;

public class GatherNumber {
    public static int toMergeNumber(char[] array) {
        try {
            return Integer.parseInt(String.valueOf(array));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("You array include not only number");
        }
    }

    public static void main(String[] args) {
        char[] numbers = {'1', '2', '3'};
        System.out.println("Merge numbers: " + toMergeNumber(numbers));
    }
}
