package com.practic1.task3;

public class FirstOddNumber {

    public static int toFindOddNumber(int[] numbers) {
        int result = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result = i;
                return result;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        //case 1 : with odd number
        int[] numbers = {2, 4, 8, 23, 54, 33, 0};
        System.out.println(toFindOddNumber(numbers));
        //case 2 : without add number
        int[] anotherNumbers = {2, 4, 8, 10, 54, 32, 10};
        System.out.println(toFindOddNumber(anotherNumbers));
    }


}
