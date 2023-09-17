package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int minIdx = FindLoop.indexInRange(data, min, index, data.length - 1);
            SwitchArray.swap(data, index, minIdx);
        }
        return data;
    }
}
