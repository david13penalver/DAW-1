import java.util.Scanner;

class Ejercicio2a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double num1;

        System.out.println("Inserta un número: ");
        num1 = reader.nextFloat();
        System.out.println("Tu número es el: " + num1);

        double squareRoot = Math.sqrt(num1);

        String squareRoot2Decimals = String.format("La raíz cuadrada de %.2f es %.2f", num1, squareRoot);
        System.out.println(squareRoot2Decimals);
    }
}
