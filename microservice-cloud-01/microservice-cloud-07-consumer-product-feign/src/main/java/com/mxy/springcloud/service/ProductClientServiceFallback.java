package com.mxy.springcloud.service;

import com.mxy.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/19 16:04
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class ProductClientServiceFallback implements ProductClientService{
    @Override
    public boolean add(Product Product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
