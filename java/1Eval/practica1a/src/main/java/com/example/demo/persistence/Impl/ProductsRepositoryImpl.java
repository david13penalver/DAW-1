package com.example.demo.persistence.Impl;

import com.example.demo.domain.entity.Product;
import com.example.demo.persistence.ProductsRepository;

import java.math.BigDecimal;
import java.util.List;

public class ProductsRepositoryImpl implements ProductsRepository {

    List<Product> products = List.of(
            new Product(1, "Producto A", "Marca A", new BigDecimal(23.99)),
            new Product(2, "Producto B", "Marca A", new BigDecimal(14.99)),
            new Product(3, "Producto C", "Marca B", new BigDecimal(68.99))
    );

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
