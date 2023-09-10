package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivision(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sumAndMultiply(first, second) + subtractAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 paвeн: " + subtractAndDivision(10, 20));
        System.out.println("Сумма 4х операций: " + sumOfAllOperations(10, 20));
    }
}
