package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap5to9() {
        int[] input = {28, 98, 349, 8294, 1371, 7, 8, 12, 42, 83, 16};
        int source = 5;
        int dest = 9;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {28, 98, 349, 8294, 1371, 83, 8, 12, 42, 7, 16};
        assertThat(result).containsExactly(expected);
    }
}