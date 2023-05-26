package com.example.springbootdockercomposewithpostgres.service;


import com.example.springbootdockercomposewithpostgres.entity.Product;

import java.util.List;

public interface ProductService {

     Product insertProduct(Product product);

     List<Product> getProducts();

}
