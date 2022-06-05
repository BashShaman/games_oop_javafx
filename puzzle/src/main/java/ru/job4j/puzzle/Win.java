package ru.job4j.puzzle;

public class Win {
    public static boolean isFilledRow(int[][] board, int rowIndex) {
        boolean rsl = true;
        for (int cell : board[rowIndex]) {
            if (cell != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean isFilledColumn(int[][] board, int columnIndex) {
        boolean rsl = true;
        for (int[] row : board) {
            if (row[columnIndex] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 1)
                    && (isFilledColumn(board, i) || isFilledRow(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
