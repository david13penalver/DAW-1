import java.util.*;

public class Ejercicio5c {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nota, option;
        String nombreAlumno;

        List<String> aprobados = new ArrayList<>();
        List<String> suspendidos = new ArrayList<>();

        do {
            System.out.println("1.- Introducir alumno.\n0.- Salir.");
            option = reader.nextInt();
            reader.nextLine();
            if (option == 1) {
                System.out.print("Introduce el nombre del alumno: ");
                nombreAlumno = reader.nextLine();
                System.out.println("Introduce la nota del alumno: ");
                nota = reader.nextInt();
                if (nota >= 5) {
                    aprobados.add(nombreAlumno);
                } else {
                    suspendidos.add(nombreAlumno);
                }
            } else {
                System.out.println("Alumnos aprobados: " + aprobados);
                System.out.println("Alumnos suspendidos: " + suspendidos);
            }
        } while (option != 0);

    }

}
