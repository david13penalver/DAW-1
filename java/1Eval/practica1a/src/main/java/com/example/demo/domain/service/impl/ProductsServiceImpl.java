package com.example.demo.domain.service.impl;

import com.example.demo.domain.entity.Product;
import com.example.demo.domain.service.ProductsService;
import com.example.demo.persistence.Impl.ProductsRepositoryImpl;
import com.example.demo.persistence.ProductsRepository;

import java.util.List;

public class ProductsServiceImpl implements ProductsService {

    ProductsRepository productsRepository = new ProductsRepositoryImpl();
    @Override
    public List<Product> getAll() {
        return productsRepository.getAll();
    }

    @Override
    public Product getById(int id) {
        return productsRepository.getById(id);
    }
}
