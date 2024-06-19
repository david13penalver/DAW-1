import java.util.Scanner;

class Ejercicio1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float num1;
        float num2;

        System.out.println("Inserta un número con decimales: ");
        num1 = reader.nextFloat();
        System.out.println("Tu número es el: " + num1);
        System.out.println("Inserta un segundo número con decimales: ");
        num2 = reader.nextFloat();
        System.out.println("Tu segundo número es el: " + num2);

        float sum = num1 + num2;
        float rest = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        float divRest = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + rest);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + divRest);
    }
}
