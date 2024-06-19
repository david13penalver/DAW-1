package herencia;

public class CPU {
    private int speed;
    private String model;

    public CPU() {
    }

    public CPU(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }


    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model=" + model +
                ", speed=" + speed +
                '}';
    }
}
