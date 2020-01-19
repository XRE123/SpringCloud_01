package com.mxy.springcloud.service.impl;

import com.mxy.springcloud.entities.Product;
import com.mxy.springcloud.mapper.ProductMapper;
import com.mxy.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 10:20
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public boolean add(Product product){
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
