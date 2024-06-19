import java.util.Scanner;

class Ejercicio3b {

    public static void showMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? "0" : " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean matriz1[][] = {{true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}};

        boolean matriz2[][] = {{false, false, false, false, true},
                {false, false, false, true, true},
                {false, false,  true, false, true},
                {false, true, false, false, true},
                {true, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true}};

        showMatrix(matriz1);
        showMatrix(matriz2);


    }
}