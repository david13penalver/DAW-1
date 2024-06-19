package com.example.demo.domain.service;

import com.example.demo.domain.entity.Product;
import com.example.demo.persistence.ProductsRepository;

import java.util.List;

public interface ProductsService {
    List<Product> getAll();
    Product getById(int id);
}
