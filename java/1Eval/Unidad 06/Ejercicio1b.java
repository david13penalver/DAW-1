import java.util.Scanner;

class Ejercicio1b {

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
        if (b == 0) {
            System.out.println("Error: División por 0");
        } else {
            float resultado = (float) a / b;
            System.out.println("El resultado de la división es " + resultado);
        }

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

        //Lo correcto sería un int e float en las operaciones y devolver eso solo.
        // En el Main, poner el sout con el texto y el resultado de la función.
        // Para combinar el texto con el return de la funcion: integer.toString(funcion).

    }
}