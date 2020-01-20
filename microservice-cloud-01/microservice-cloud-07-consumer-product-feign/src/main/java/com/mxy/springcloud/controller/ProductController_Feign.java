package com.mxy.springcloud.controller;

import com.mxy.springcloud.entities.Product;
import com.mxy.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 14:31
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class ProductController_Feign {

    @Autowired
    ProductClientService productClientService;

    @RequestMapping(value = "/consumer/product/add")
    public Boolean add(Product product){
        return productClientService.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") long id){
        return productClientService.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return productClientService.list();
    }

}
