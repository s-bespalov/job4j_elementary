package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] row : array) {
            for (int val : row) {
                rsl += val;
            }
        }
        return rsl;
    }
}
