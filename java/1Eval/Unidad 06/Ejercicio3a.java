import java.util.Scanner;

class Ejercicio3a {


    static void compare(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("El primer número es más grande");
        } else {
            System.out.println("El segundo número es más grande");
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int number1 = reader.nextInt();
        System.out.println("Introduzca el segundo número");
        int number2 = reader.nextInt();

        compare(number1, number2);

    }
}