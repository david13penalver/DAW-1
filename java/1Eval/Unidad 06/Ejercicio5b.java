import java.util.Scanner;

class Ejercicio5b {

    static int areaSquare(int number1, int number2) {
        int area = number1 * number2;
        return area;
    }


    static int areaTriangle(int number1, int number2) {
        int area = number1 * number2 / 2;
        return area;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println(
                "0- Cerrar \n" +
                "1- Cuadrado \n" +
                "2- Triángulo");
        int option = reader.nextInt();

        switch (option) {
            case 0:
                System.out.println("Cerrando programa");
                break;
            case 1:
                System.out.println("Introduce la base:");
                number1 = reader.nextInt();
                System.out.println("Introduce la altura:");
                number2 = reader.nextInt();
                System.out.print("El resultado es: ");
                System.out.println(areaSquare(number1, number2));;
                break;
            case 2:
                System.out.println("Introduce la base:");
                number1 = reader.nextInt();
                System.out.println("Introduce la altura:");
                number2 = reader.nextInt();
                System.out.print("El resultado es: ");
                System.out.println(areaTriangle(number1, number2));
                break;
            default:
                System.out.println("No has elegido ninguna de las dos opciones");
        }

    }
}