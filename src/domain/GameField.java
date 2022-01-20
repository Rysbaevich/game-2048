package domain;

public class GameField {

    // Состояние - переменные
    private int[][] matrix;

    public GameField(int size) {
        matrix = new int[][]{
                {0, 0, 0, 2},
                {2, 2, 4, 8},
                {4, 16, 32, 0},
                {64, 32, 2048, 8}};
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
