import java.util.UUID;

public class GeneradorId {
    private static GeneradorId instance;
    private UUID id;

    private GeneradorId() {
    }

    public UUID getUuid() {
        this.id = UUID.randomUUID();
        return this.id;
    }

    public static GeneradorId getInstance() {
        if (instance == null) {
            instance = new GeneradorId();
        }
        return instance;
    }


}
