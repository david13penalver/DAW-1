package com.example.demo.controller;
import java.math.BigDecimal;
import java.util.List;

import com.example.demo.domain.entity.Product;
import com.example.demo.domain.service.ProductsService;
import com.example.demo.domain.service.impl.ProductsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/products")
@Controller
public class ProductController {
    ProductsService productsService = new ProductsServiceImpl();

    @GetMapping("")
    public String getAll(Model model){
        model.addAttribute("products", productsService.getAll());
        return "products";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model){
        Product product = productsService.getById(id);
        model.addAttribute("product", product);
        return "productsdetails";
    }

}
