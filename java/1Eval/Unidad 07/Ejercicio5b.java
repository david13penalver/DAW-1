import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;

class Ejercicio5b {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float mark;
        List<String> students = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        List<String> passed = new ArrayList<>();


        for (String student : students) {
            System.out.println("Ponga la nota de " + student + ":");
            mark = reader.nextFloat();
            if (mark >= 5) {
                System.out.println("El alumno " + student + " está aprobado con un " + mark);
                passed.add(student);
            }
        }

        System.out.println(passed);

    }
}