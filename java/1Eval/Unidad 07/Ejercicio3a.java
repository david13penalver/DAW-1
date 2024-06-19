import java.util.Scanner;

class Ejercicio3a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean numbers[][] = {{true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}};

        //for (int elemento_fila : numbers) {
        //    for (int elemento_columna : elemento_fila) {
        //        System.out.println((boolean) elemento_columna);
        //    };
        //};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] ? "0" : " ");
            }
            System.out.println();
        }
    }
}