package haciendoTodo;

public class Coche {
    private String marca, modelo, color;
    private int numeroBastidor, velocidad = 0;

    public Coche(String marca, String modelo, String color, int numeroBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroBastidor = numeroBastidor;
    }

    public int increaseSpeed(int velocidad) {
        return this.velocidad += velocidad;
    }
    public int decreaseSpeed(int velocidad) {
        if (this.velocidad > 5) {
            return this.velocidad -= velocidad;
        } else {
            return this.velocidad = 0;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numeroBastidor=" + numeroBastidor +
                ", velocidad=" + velocidad +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
