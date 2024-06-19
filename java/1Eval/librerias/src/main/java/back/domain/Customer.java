package back.domain;

public class Customer {
    private int id;
    private String name, cif;

    public Customer(int id, String name, String cif) {
        this.id = id;
        this.name = name;
        this.cif = cif;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCif() {
        return cif;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}
