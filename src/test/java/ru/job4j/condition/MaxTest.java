package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenMax10To7Then10() {
        int left = 10;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenMax8To94Then94() {
        int left = 8;
        int right = 94;
        int result = Max.max(left, right);
        int expected = 94;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3and3and4Then4() {
        int first = 3;
        int second = 3;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9and2and11and11Then11() {
        int first = 9;
        int second = 2;
        int third = 11;
        int fourth = 11;
        int result = Max.max(first, second, third, fourth);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax11and17and9and22Then22() {
        int first = 11;
        int second = 17;
        int third = 9;
        int fourth = 22;
        int result = Max.max(first, second, third, fourth);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }
}