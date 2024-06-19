package herencia;

public class Memory {
    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public Memory() {
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}
