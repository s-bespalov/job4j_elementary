package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDoesNotHaveMonoHorizontalInRow4() {
        char[][] input = {
                {' ', ' ', ' ', 'X', 'X'},
                {'X', 'X', 'X', ' ', 'X'},
                {' ', ' ', ' ', 'X', ' '},
                {'X', 'X', ' ', 'X', ' '},
                {'X', 'X', 'X', 'X', ' '},
        };
        int row = 4;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenDoesNotHaveMonoHorizontalInRow1() {
        char[][] input = {
                {' ', ' ', ' ', 'X', 'X'},
                {'X', 'X', 'X', ' ', 'X'},
                {' ', ' ', ' ', 'X', ' '},
                {'X', 'X', ' ', 'X', ' '},
                {'X', 'X', 'X', 'X', ' '},
        };
        int row = 4;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDoesNotHaveMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', ' ', ' '},
                {'X', 'X', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}