import java.util.*;

class Ejercicio6a {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int calificacion;

        Map<String, Integer> listadoNotas = new HashMap<>();
        String[] alumnos = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};

        for (String alumno : alumnos) {
            System.out.println("Inserta la nota de " + alumno);
            calificacion = reader.nextInt();
            listadoNotas.put(alumno, calificacion);
        }

        System.out.println(listadoNotas);

    }
}