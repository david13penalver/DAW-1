package corregidos;

public class Conductor {
    String nombre;
    Coche coche;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCoche(int numBastidor, Flota flota) {
        Coche coche = flota.buscarCoche(numBastidor);
        if (coche != null) {
            this.coche = coche;
        }
    }

    public boolean eliminarCoche() {
        if (coche != null) {
            // Cuando suba las cosas, lo podré ver jeje.
        }
        return false;
    }

    @Override
    public String toString() {
        if (coche != null) {
            return "Conductor{" +
                    "nombre='" + nombre + '\'' +
                    ", coche=" + coche +
                    '}';
        }
        return nombre + " no tiene asignado ningún coche.";
    }


}
