package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point that = new Point(0, 0);
        Point other = new Point(2, 0);
        double out = that.distance(other);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when39to45then4dot12() {
        double expected = 4.12;
        Point that = new Point(3, 9);
        Point other = new Point(4, 5);
        double out = that.distance(other);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when81to26then7dot81() {
        double expected = 7.81;
        Point that = new Point(8, 1);
        Point other = new Point(2, 6);
        double out = that.distance(other);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when432to187then7dot68() {
        double expected = 7.68;
        Point that = new Point(4, 3, 2);
        Point other = new Point(1, 8, 7);
        double out = that.distance3d(other);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when854and999then6dot48() {
        double expected = 6.48;
        Point that = new Point(8, 5, 4);
        Point other = new Point(9, 9, 9);
        double out = that.distance3d(other);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}