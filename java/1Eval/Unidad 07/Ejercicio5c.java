import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;

class Ejercicio5c {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<String> students = new ArrayList<>();
        List<String> passed = new ArrayList<>();
        List<String> failed = new ArrayList<>();

        int option;
        float mark;
        String studentName;

        System.out.println("Bienvenido a la publicación de notas. " +
                "Escriba el nombre del alumno para añadir su nota. " +
                "Escriba 'Salir' para finalizar el programa.");

        do {
            System.out.println("1- Introducir alumno.\n" +
                    "0- Salir.\n" +
                    "-------------");
            option = reader.nextInt();
            reader.nextLine(); //PREGUNTAR POR QUÉ HAY QUE PONER ESTO PARA QUE DESPUÉS SE PONGA EL ALUMNO
            if (option == 1) {
                System.out.println("Introduzca el nombre del alumno:");
                studentName = reader.nextLine();
                System.out.println("Introduzca la nota de " + studentName + " :");
                mark = reader.nextFloat();
                if (mark >= 5) {
                    passed.add(studentName);
                } else {
                    failed.add(studentName);
                }
            }
        } while (option != 0);

        System.out.println("Alumnos aprobados: " + passed);
        System.out.println("Alumnos suspendidos: " + failed);

    }
}