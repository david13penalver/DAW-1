import java.util.Scanner;
class Ejercicio2a {
    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número entero: ");
        number = reader.nextInt();
        System.out.println(number +" x 0 es igual a " + (number * 0));
        System.out.println(number +" x 1 es igual a " + (number * 1));
        System.out.println(number +" x 2 es igual a " + (number * 2));
        System.out.println(number +" x 3 es igual a " + (number * 3));
        System.out.println(number +" x 4 es igual a " + (number * 4));
        System.out.println(number +" x 5 es igual a " + (number * 5));
        System.out.println(number +" x 6 es igual a " + (number * 6));
        System.out.println(number +" x 7 es igual a " + (number * 7));
        System.out.println(number +" x 8 es igual a " + (number * 8));
        System.out.println(number +" x 9 es igual a " + (number * 9));
        System.out.println(number +" x 10 es igual a " + (number * 10));

    }
}
