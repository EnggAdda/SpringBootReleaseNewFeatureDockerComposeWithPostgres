package com.example.springbootdockercomposewithpostgres.repo;


import com.example.springbootdockercomposewithpostgres.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
