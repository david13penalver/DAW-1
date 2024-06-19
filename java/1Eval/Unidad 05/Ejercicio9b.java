import java.util.Scanner;

class Ejercicio9b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("0.- Salir");
        System.out.println("1.- Opción A");
        System.out.println("2.- Opción B");
        System.out.println("3.- Opción C");
        System.out.println("--------------------");

        System.out.print("Opción: ");
        int number = reader.nextInt();
        while (number != 0) {
            System.out.println("Ha elegido la opción " + number);
            System.out.print("Opción: ");
            number = reader.nextInt();
        }
        if (number == 0) {
            System.out.println("Cerrando programa");
        }

    }
}
