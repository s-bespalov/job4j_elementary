package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 165;
        double woman = Fit.womanWeight(height);
        System.out.println("woman 165 is " + woman);
        double man = Fit.manWeight(height);
        System.out.println("man 165 is " + man);
    }
}
