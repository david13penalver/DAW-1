import java.util.Scanner;

class Ejercicio5a {

    static int areaCalc(int number1, int number2) {
        int area = number1 * number2;
        return area;
    }


    static int areaCalc(int number1, int number2, int number3) {
        int area = number1 * number2 / 2;
        return area;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la base");
        int number1 = reader.nextInt();
        System.out.println("Introduce el tamaño de la altura");
        int number2 = reader.nextInt();
        System.out.println("Si quieres que sea un triángulo, introduce 2. Si no, cualquier otro valor");
        int number3 = reader.nextInt();

        if (number3 != 2) {
            System.out.println(areaCalc(number1, number2));
        } else {
            System.out.println(areaCalc(number1, number2, 2));
        }

            }
}