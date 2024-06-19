import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    static Scanner reader = new Scanner(System.in);
    static int option, r;
    static int[][] matrix = creaMatriz();
    static Random random = new Random();
    public static String showMenu() {
        return "1. Mostrar números pares hasta el 100\n" +
                "2. Mostrar números pares hasta un número introducido por el usuario\n" +
                "3. Listar mayores de edad\n" +
                "4. Matriz\n" +
                "5. Cifrar texto\n" +
                "6. Superhéroes\n" +
                "0. Salir";
    }

    public static void showEven(int number) {
        if (number == 2) {
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            option = reader.nextInt();
            for (int i = 2; i <= option; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void oldEighteen() {
        Map<String, Integer> older = new HashMap<>();
        int value;
        older = Map.of("Pepe", 18, "Pepa", 16, "Mario", 17, "María", 19);
        for (String key : older.keySet()) {
            value = older.get(key);
            if (value >= 18) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }

    public static int[][] creaMatriz() {
        int size = 6;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else if (i > j) {
                    do {
                        r = random.nextInt(9-1) + 1;
                    } while (r % 2 == 0);
                }
            }
        }
        return matrix;
    }
    public static void muestraMatriz() {

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void caesarCipher() {
        String chain = "abcdefghijklmnñopqrstuvwxyzabc", cipherText = "";
        int shift = 3;
        String word = reader.nextLine().toLowerCase();
        char letter = word.charAt(shift);
        for (int i = 0; i < word.length(); i++) {
            int charPosition = chain.indexOf(word.charAt(i));
            int keyVal = (shift  + charPosition) % 29;
            char replaceVal = chain.charAt(keyVal);
            cipherText += replaceVal;
        }
        System.out.println(cipherText);
    }
    public static int superheroes() {
        return 100;
    }
    public static void closeProgram() {
        System.exit(0);
    }

    public static void execute(int option) {
        switch (option) {
            case 1:
                showEven(2);
                break;
            case 2:
                showEven(3);
                break;
            case 3:
                oldEighteen();
                break;
            case 4:
                muestraMatriz();
                break;
            case 5:
                caesarCipher();
                break;
            case 6:
                superheroes();
                break;
            case 0:
                closeProgram();
                break;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println(showMenu());
            System.out.print("Opción: ");
            option = reader.nextInt();
            System.out.println();
            int[][] matrix = creaMatriz();
            execute(option);
        } while (option != 0);






    }

}
