package herencia;

public class Clothes extends Product{
    private int size;
    private String type, color;
    public Clothes() {
    }

    public Clothes(int id, float price, String type, int size, String color) {
        super(id, price);
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", productList=" + productList +
                '}';
    }
}
