import java.util.Scanner;

public class Ejercicio3c {

    static void showMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]) {
                    System.out.print("0");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean array0[][] = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };

        boolean array1[][] = {
                {false, false, false, false, true},
                {false, false, false, true, true},
                {false, false,  true, false, true},
                {false, true, false, false, true},
                {true, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true}
        };

        int option = reader.nextInt();

        switch (option) {
            case 0:
                showMatrix(array0);
                break;
            case 1:
                showMatrix(array1);
                break;
            default:
                System.out.println("No se puede representar el bit.");
        }
    }

}
