package com.mxy.springcloud.service;

import com.mxy.springcloud.entities.Product;

import java.util.List;

public interface ProductService {
        boolean add(Product product);
        Product get(Long id);
        List<Product> list();
}
