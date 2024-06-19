package exam2;

public class Lamp {

    double consumption;
    boolean turnOn = false;

    public Lamp(double consumption) {
        this.consumption = consumption;
    }

    public Lamp(double consumption, boolean turnOn) {
        this.consumption = consumption;
        this.turnOn = turnOn;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void turnOn() {
        turnOn = true;
    }

    public void turnOff() {
        turnOn = false;
    }

    public void toggle() {
        if (turnOn == true) {
            this.turnOn = false;
        } else {
            this.turnOn = true;
        }
    }

    public double consumption(double seconds) {
        if (isTurnOn() == false || seconds == 0)
            return 0;
        else {
            double totalConsumption = getConsumption() * seconds / 3600;
            return totalConsumption;
        }
    }
}
