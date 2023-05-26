package com.example.springbootdockercomposewithpostgres.controller;


import com.example.springbootdockercomposewithpostgres.entity.Product;
import com.example.springbootdockercomposewithpostgres.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/findAll")
   public List<Product> getAllProducts(){
      return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insert(@RequestBody Product product){
        return productService.insertProduct(product);
    }


}
