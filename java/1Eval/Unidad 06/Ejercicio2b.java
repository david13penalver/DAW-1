import java.util.Scanner;

class Ejercicio2b {


    static void option1() {
        System.out.println("Ha elegido la opción 1");
    }

    static void option2() {
        System.out.println("Ha elegido la opción 2");
    }

    static void option3() {
        System.out.println("Ha elegido la opción 3");
    }

    static void option0() {
        System.exit(0);
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println("0.- Salir\n" +
                    "1.- Opción A\n" +
                    "2.- Opción B\n" +
                    "3.- Opción C\n" +
                    "--------------------");
            option = reader.nextInt();
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
                case 0: {
                    option0();
                    break;
                }

            }
        } while (option != 0);

    }
}