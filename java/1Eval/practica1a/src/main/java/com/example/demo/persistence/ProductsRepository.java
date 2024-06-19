package com.example.demo.persistence;

import com.example.demo.domain.entity.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> getAll();

    Product getById(int id);
}
