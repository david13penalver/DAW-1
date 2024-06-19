import java.util.Scanner;

class Ejercicio1a {

    static void suma(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma es " + resultado);
    }

    static void resta(int a, int b) {
        int resultado = a - b;
        System.out.println("El resultado de la resta es " + resultado);
    }

    static void multiplicacion(int a, int b) {
        int resultado = a * b;
        System.out.println("El resultado de la multiplicación es " + resultado);
    }

    static void division(int a, int b) {
        float resultado = (float) a / b;
        System.out.println("El resultado de la división es " + resultado);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número a sumar");
        int a = reader.nextInt();
        System.out.println("Introduce el segundo número a sumar");
        int b = reader.nextInt();

        suma(a, b);
        resta(a, b);
        multiplicacion(a, b);
        division(a, b);


    }
}