import java.util.Scanner;

class Ejercicio3c {

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
        int option;

        System.out.println("Seleccione un número binario");
        option = reader.nextInt();

        if (option == 0) {
            showMatrix(matriz1);
        } else if (option == 1) {
            showMatrix(matriz2);
        } else {
            System.out.println("No se puede representar el bit.");
        }
        
    }
}