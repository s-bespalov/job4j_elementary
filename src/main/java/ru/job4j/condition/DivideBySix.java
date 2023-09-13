package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        boolean even = number % 2 == 0;
        boolean divBy3 = number % 3 == 0;
        if (even && divBy3) {
            rsl = "The number divides by 6.";
        } else if (even) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else if (divBy3) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}
