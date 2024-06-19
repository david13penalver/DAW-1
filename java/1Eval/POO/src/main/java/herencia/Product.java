package herencia;

import java.util.ArrayList;
import java.util.List;

public class Product {
    protected int id;
    protected float price;
    List<Product> productList = new ArrayList<>();
    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product() {}
    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }


}
