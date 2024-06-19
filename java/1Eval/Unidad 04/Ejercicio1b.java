import java.util.Scanner;

class Ejercicio1b {
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

        int num1Int = (int) num1;
        int num2Int = (int) num2;
        int sumInt = (int) sum;
        int restInt = (int) rest;
        int multInt = (int) mult;
        int divInt = (int) div;
        int divRestInt = (int) divRest;

        System.out.println(num1Int + " + " + num2Int + " = " + sumInt);
        System.out.println(num1Int + " + " + num2Int + " = " + restInt);
        System.out.println(num1Int + " + " + num2Int + " = " + multInt);
        System.out.println(num1Int + " + " + num2Int + " = " + divInt);
        System.out.println(num1Int + " + " + num2Int + " = " + divRestInt);
    }
}
