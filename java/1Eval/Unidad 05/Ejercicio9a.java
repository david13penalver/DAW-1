import java.util.Scanner;

class Ejercicio9a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("1.- Opción A");
        System.out.println("2.- Opción B");
        System.out.println("3.- Opción C");
        System.out.println("--------------------");



        System.out.print("Opción: ");
        int number = reader.nextInt();
        System.out.println("Ha elegido la opción " + number);

    }
}
