package corregidos;

public class Coche {
    private String marca, modelo, color;
    private Integer numBastidor, velocidad = 0;


    public Coche(String marca, String modelo, String color, Integer numBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numBastidor = numBastidor;
        this.velocidad = 0;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumBastidor() {
        return numBastidor;
    }

    public Integer getVelocidad() {
        return velocidad;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumBastidor(Integer numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        this.velocidad += 5;
    }

    public void frenar() {
        if (velocidad > 5) {
            this.velocidad -= 5;
        } else {
            velocidad = 0;
        }
    }

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar(int velocidad) {
        if (this.velocidad > velocidad) {
            this.velocidad -= 5;
        } else {
            this.velocidad = 0;
        }
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numBastidor=" + numBastidor +
                ", velocidad=" + velocidad +
                '}';
    }
}
