package com.example.springbootdockercomposewithpostgres.service.impl;

import com.example.springbootdockercomposewithpostgres.entity.Product;
import com.example.springbootdockercomposewithpostgres.repo.ProductRepo;
import com.example.springbootdockercomposewithpostgres.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
   private ProductRepo productRepo;

    @Override
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
