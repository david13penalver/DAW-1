import java.util.Scanner;
class Ejercicio1d {
    public static void main(String[] args) {
        int base;
        int altura;
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe la base con un número entero: ");
        base = reader.nextInt();
        System.out.println("El número es: " + base);
        reader.nextLine();
        System.out.println("Escribe la altura con un número entero: ");
        altura = reader.nextInt();
        System.out.println("El número es: " + altura);
        reader.nextLine();

        float areaTriangulo = ((float) base * altura) / 2;

        System.out.println(areaTriangulo);
    }
}
