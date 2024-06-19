import java.util.Scanner;

public class Ejercicio3cOK {

    static boolean[][] board0 = {
            {true, true, true, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, true, true, true}
    };

    static boolean[][] board1 = {
            {false, false, false, false, true},
            {false, false, false, true, true},
            {false, false,  true, false, true},
            {false, true, false, false, true},
            {true, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true}
    };

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;

        System.out.print("Escribe un número binario: ");
        number = reader.nextInt();
        showNumber(number);

    }

    private static void showNumber(int number) {
        int bits = number;
        int bit;

        while (bits >= 1) {
            bit = bits%10;
            if(bit == 0) {
                showBit(board0);
            } else if (bit == 1){
                showBit(board1);
            } else {
                System.out.println("No se puede representar el bit");
            }
            bits /= 10;
        }
    }

    private static void showBit(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}