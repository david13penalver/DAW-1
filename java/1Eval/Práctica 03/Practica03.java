import java.util.*;
import java.lang.*;

class Practica03 {

    static int boatNumber = 6;
    static int boardSize = 8;
    static int[][] board = new int[boardSize][boardSize];

    static void boatSelection(int boatNumber) {
        int boatNumbers = boatNumber;
        do {
            Random r = new Random();
            int low = 0;
            int high = boardSize;
            int resultRow = r.nextInt(high-low) + low;
            int resultColumn = r.nextInt(high-low) + low;

            if (board[resultRow][resultColumn] != 1) {
                board[resultRow][resultColumn] = 1;
                boatNumbers--;
            }
        } while (boatNumbers > 0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int optionRow;
        int optionColumn;
        int maxShot = 48;
        int remainingBoats = Practica03.boatNumber;

        System.out.print("Introduzca su nombre: ");
        String name = reader.nextLine();
        System.out.println();

        System.out.println("Bienvenido/a a Hundir la Flota, " + name +
                ". En este juego buscará aniquilar todos los barcos del enemigo. " +
                "Para ello, contará con " + maxShot + " bombas como munición. " + "Los barcos a derribar serán " + boatNumber + "." +
                "El juego terminará cuando se quede sin munición o cuando derribe todos los barcos. " +
                "Si lo desea, puede salir del juego asignando el valor 0 cuandos se pida el número de filas o columnas. " +
                "¡Muchísima suerte en su misión, grumete!");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Situación del tablero: ");

        boatSelection(Practica03.boatNumber);

        for (int[] row_element : board) {
            for (int column_element : row_element) {
                System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println();

        do {
            System.out.println("Introduce el número de la fila que quiere atacar:");
            optionRow = reader.nextInt();
            System.out.println("Introduce el número de la columna que quiere atacar:");
            optionColumn = reader.nextInt();
            System.out.println();

            if (optionRow == 0 || optionColumn == 0) {
                System.out.println("Cerrando juego.");
                System.out.println("Cerrando juego..");
                System.out.println("Cerrando juego...");
                System.out.println("Juego cerrado.");
                System.exit(0);
            }

            if (optionRow > boardSize || optionColumn > boardSize) {
                do {
                    System.out.println("El número máximo de la fila y/o la columna es 8. ¡Sigue probando!");
                    System.out.println("Introduce el número de la fila que quiere atacar:");
                    optionRow = reader.nextInt();
                    System.out.println("Introduce el número de la columna que quiere atacar:");
                    optionColumn = reader.nextInt();
                    System.out.println();
                    if (optionRow == 0 || optionColumn == 0) {
                        System.out.println("Cerrando juego.");
                        System.out.println("Cerrando juego..");
                        System.out.println("Cerrando juego...");
                        System.out.println("Juego cerrado.");
                        System.exit(0);
                    }
                } while (optionRow > boardSize || optionColumn > boardSize);
            }

            if (board[optionRow - 1][optionColumn - 1] == 1) {
                board[optionRow - 1][optionColumn - 1] = 3;
            } else {
                board[optionRow - 1][optionColumn - 1] = 2;
            }

            for (int[] row_element : board) {
                for (int column_element : row_element) {
                    switch (column_element) {
                        case 0:
                        case 1:
                            System.out.print("0 ");
                            break;
                        case 2:
                            System.out.print("- ");
                            break;
                        case 3:
                            System.out.print("X ");
                            remainingBoats--;
                            break;
                    }
                }
                System.out.println();
            }
            System.out.println();

            if ((optionRow > 0 && optionColumn > 0) && (optionRow <= boardSize && optionColumn <= boardSize)) {
                System.out.println("Disparo hecho");
                maxShot--;
                System.out.println("Munición restante: " + maxShot + " disparos.");
                System.out.println();
                System.out.println();
                System.out.println();

                if (remainingBoats == 0) {
                    System.out.println("¡Enhorabuena, has ganado!");
                    System.exit(0);
                }
            }
        } while (maxShot != 0);

        if (maxShot == 0) {
            System.out.println("Game Over.");
            System.exit(0);
        }



    }
}