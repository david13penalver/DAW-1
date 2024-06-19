import java.util.Scanner;

class Ejercicio6b {

    static int recursiveSum(int number) {
        if (number == 0) {
            return 0;
        } else if (number > 0) {
            return (number + recursiveSum(number - 1));
        } else {
            return number + recursiveSum(number + 1);
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el número");
        int number = reader.nextInt();

        System.out.print("El resultado es: " + recursiveSum(number));

    }
}