package haciendoTodo;

public class Conductor {

    private String nombre;
    private Coche coche;

    public void asignarCoche(int numeroBastidor, Flota flota) {
        Coche coche = flota.buscarCoche(numeroBastidor);
        if (coche != null) {
            this.coche = coche;
        }
    }

    public boolean removeCoche() {
        if(this.coche != null) {
            this.coche = null;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCocheAsignado() {
        return coche;
    }

    public void setCocheAsignado(Coche cocheAsignado) {
        this.coche = cocheAsignado;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", cocheAsignado=" + coche +
                '}';
    }
}
