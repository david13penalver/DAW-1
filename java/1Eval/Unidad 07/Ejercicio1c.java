import java.util.Scanner;

class Ejercicio1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (double i : numbers) {
            i = Math.pow((double) i, 2);
            System.out.println(i);
        };

    }
}