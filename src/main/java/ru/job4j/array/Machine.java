package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        int coinIdx = 0;
        while (change > 0) {
            if (change / coins[coinIdx] > 0) {
                change -= coins[coinIdx];
                rsl[size] = coins[coinIdx];
                size++;
            } else {
                coinIdx++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
