package ru.job4j.calculator;

/**
 * Класс Fit содержит методы для расчета идеального веса на основе роста.
 */
public class Fit {
    private static final int BASE_HEIGHT_MAN = 100;
    private static final int BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    /**
     * Рассчитывает идеальный вес для мужчины на основе его роста.
     * @param height Рост мужчины в сантиметрах.
     * @return Идеальный вес мужчины в килограммах.
     */
    public static double calculateManWeight(int height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_FACTOR;
    }

    /**
     * Рассчитывает идеальный вес для женщины на основе ее роста.
     * @param height Рост женщины.
     * @return Идеальный вес женщины.
     */
    public static double calculateWomanWeight(int height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_FACTOR;
    }

    public static void main(String[] args) {
        int height = 165;
        double woman = Fit.calculateWomanWeight(height);
        System.out.printf("Woman with height %d is %.2f%n", height, woman);
        double man = Fit.calculateManWeight(height);
        System.out.printf("Man with height %d is %.2f%n", height, man);
    }
}
