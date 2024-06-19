import java.util.Scanner;

class Ejercicio3b {


    static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int number1 = reader.nextInt();
        System.out.println("Introduzca el segundo número");
        int number2 = reader.nextInt();

        System.out.println(compare(number1, number2));

    }
}