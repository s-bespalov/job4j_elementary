package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double squareX = Math.pow(deltaX, 2);
        double squareY = Math.pow(deltaY, 2);
        double squareSum = squareX + squareY;
        double rsl = Math.sqrt(squareSum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(98, 16, 11, 38);
        System.out.println("result (98, 16) to (11, 38) " + result2);
    }
}
