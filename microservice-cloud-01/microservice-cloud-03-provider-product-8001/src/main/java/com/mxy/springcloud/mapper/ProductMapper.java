package com.mxy.springcloud.mapper;

import com.mxy.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface ProductMapper {
    Product findById(long id);
    List<Product> findAll();
    boolean addProduct(Product product);
}
