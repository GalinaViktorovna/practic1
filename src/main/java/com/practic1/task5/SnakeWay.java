package com.practic1.task5;

import java.util.ArrayList;
import java.util.List;

public class SnakeWay {

    public static int[] toGoLikeSnake(int[][] matrix) {
        List<Integer> tempResult = new ArrayList<>();
        for (int y = 0; y < matrix.length; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < matrix.length; x++) {
                    tempResult.add(matrix[x][y]);
                }
            } else {
                for (int x = matrix.length - 1; x >= 0; x--) {
                    tempResult.add(matrix[x][y]);
                }
            }
        }
        int[] result = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = toGoLikeSnake(array);
        for (int number : result
                ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
