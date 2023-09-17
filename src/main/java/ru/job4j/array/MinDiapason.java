package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = -1;
        if (start >= 0 && start <= finish && finish < array.length) {
            min = array[start];
            for (int index = start + 1; index <= finish; index++) {
                if (array[index] < min) {
                    min = array[index];
                }
            }
        }
        return min;
    }
}
