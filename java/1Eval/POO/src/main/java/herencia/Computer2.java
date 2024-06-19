package herencia;

public class Computer2 extends Product {
    private HD hd;
    private Memory memory;
    private CPU cpu;

    public Computer2() {}
    public Computer2(HD hd, Memory memory, CPU cpu, int id, float price) {
        super(id, price);
        this.hd = hd;
        this.memory = memory;
        this.cpu = cpu;

    }

    public HD getHd() {
        return hd;
    }

    public Memory getMemory() {
        return memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hd=" + hd +
                ", memory=" + memory +
                ", cpu=" + cpu +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
