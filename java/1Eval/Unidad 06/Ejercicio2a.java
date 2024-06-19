import java.util.Scanner;

class Ejercicio2a {

    static void option1() {
        System.out.println("Ha elegido la opción 1");
    }

    static void option2() {
        System.out.println("Ha elegido la opción 2");
    }

    static void option3() {
        System.out.println("Ha elegido la opción 3");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("1.- Opción A\n" +
                "2.- Opción B\n" +
                "3.- Opción C\n" +
                "--------------------");

        int option = reader.nextInt();

        switch (option) {
            case 1: {
                option1();
                break;
            }
            case 2: {
                option2();
                break;
            }
            case 3: {
                option3();
                break;
            }
        }

    }
}