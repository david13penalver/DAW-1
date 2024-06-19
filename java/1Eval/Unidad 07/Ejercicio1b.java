import java.util.Scanner;

class Ejercicio1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i : numbers) {
            double j = Math.pow((double)i, 2);
            System.out.println(j);
        };

    }
}