import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Inserta un número: ");
        num1 = reader.nextFloat();
        System.out.println("Tu número es el: " + num1);
        System.out.println("Inserta un segundo número: ");
        num2 = reader.nextFloat();
        System.out.println("Tu segundo número es el: " + num2);

        double powCalc = Math.pow(num1, num2);

        String powCalc2Decimals = String.format("La potencia de de %.2f elevado a %.2f es %.2f", num1, num2, powCalc);
        System.out.println(powCalc2Decimals);
    }
}
