package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (notValid(x1) || notValid(y1) || notValid(x2) || notValid(y2)) {
            return rsl;
        }
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        if (dx == dy) {
            rsl = dx;
        }
        return rsl;
    }

    private static boolean notValid(int coordinate) {
        return coordinate < 0 || coordinate > 7;
    }
}
