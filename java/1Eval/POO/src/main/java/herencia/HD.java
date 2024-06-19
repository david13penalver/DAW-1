package herencia;

public class HD {
    private int type, capacity;

    public HD() {};
    public HD(int type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HD{" +
                "type=" + type +
                ", capacity=" + capacity +
                '}';
    }
}
