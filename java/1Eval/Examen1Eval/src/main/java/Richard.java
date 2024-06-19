import java.util.*;

public class Richard {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int[] list;
        Set<Integer> pares = new HashSet<>();
        Set<Integer> impares = new HashSet<>();

        System.out.println("Inserta el número de valores que quiere añadir al array:");
        number = reader.nextInt();
        list = new int[number];

        for (int i = 0; i < list.length; i++) {
            number = reader.nextInt();
            list[i] = number;
            if (number % 2 == 0) {
                pares.add(number);
            } else {
                impares.add(number);
            }
        }

        System.out.println("Números insertados:");

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Números insertados y ordenados:");

        Arrays.sort(list);
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Números insertados y pares:");

        for (int i : pares) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Números insertados e impares:");

        for (int i : impares) {
            System.out.print(i + " ");
        }
    }
}
