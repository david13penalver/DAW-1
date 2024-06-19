import java.util.Scanner;

class Ejercicio4a {

    static int numbersSum;

    static int sum(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbersSum += numbers[i];
        }
        return numbersSum;
    }


    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 10;

        System.out.println(sum(a, b, c, d, e));
    }
}