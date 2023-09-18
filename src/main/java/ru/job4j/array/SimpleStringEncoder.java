package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        int counter = 1;
        String result = "" + symbol;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                symbol = input.charAt(i);
                result += "" + (counter > 1 ? counter : "") + symbol;
                counter = 1;
            }
        }
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}
