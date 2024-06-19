public class Coche {
    private String marca, modelo, color;
    private int numeroBastidor, velocidad = 0;

    public String toString(Coche coche) {
        return marca + " " + modelo + " de color " + color + " con número de bastidor "
                + numeroBastidor + ".";
    }

    public int accelerateCar(int number) {
        return velocidad += number;
    }
    public int decelerateCar(int number) {
        if (velocidad - number <= 0) {
            return 0;
        } else {
            return velocidad -= number;
        }
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }
    public int getNumeroBastidor() {
        return numeroBastidor;
    }
}
