package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(first, second);
        return max(tmp, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(first, second, third);
        return max(tmp, fourth);
    }
}
