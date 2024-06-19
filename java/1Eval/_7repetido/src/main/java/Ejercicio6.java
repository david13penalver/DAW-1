import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nota;
        List<String> alumnos = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        //final String[] alumnos = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        Map<String, Integer> notasAlumnos = new HashMap<>();

        for (String alumno : alumnos) {
            System.out.print("Nota de " + alumno + ": ");
            nota = reader.nextInt();
            notasAlumnos.put(alumno, nota);
        }

        System.out.println(notasAlumnos);
    }
}