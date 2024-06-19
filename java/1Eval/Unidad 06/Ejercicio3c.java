import java.util.Scanner;

class Ejercicio3c {

    static int number1;
    static int number2;
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
        Ejercicio3c.number1 = reader.nextInt();
        System.out.println("Introduzca el segundo número");
        Ejercicio3c.number2 = reader.nextInt();

        System.out.println(compare(Ejercicio3c.number1, Ejercicio3c.number2));
    }
}