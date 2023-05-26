package com.example.springbootdockercomposewithpostgres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="product")
@Entity
public class Product {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
    private String name ;
    private double price;
    private Integer qty ;
}
