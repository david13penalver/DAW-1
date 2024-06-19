package herencia;

public enum CPU2 {

    PENTIUM_GOLD_G7400("3.7 GHz"),
    RYZEN_3_4100("3.8 GHz"),
    CORE_I5_12400F("2.1 GHz"),
    RYZEN_7_5800X("3.8 GHz"),
    CORE_I7_12700KF("3.8 GHz");
    private String speed;

    private CPU2(String speed) {
        this.speed = speed;
    }

    // Y en CPU lo que haríamos sería seleccionar CPU2.CORE_I7_12700KF en el tipo de CPU.
}
