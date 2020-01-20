package com.mxy.springcloud.controller;

import com.mxy.springcloud.entities.Product;
import com.mxy.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 10:33
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product Product){
        return productService.add(Product);
    }

    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id){
        Product product = productService.get(id);
        if(product == null){
            throw new RuntimeException("ID " + id + "无效");
        }
        return product;
    }

    public Product getFallback(@PathVariable("id") Long id){
        return new Product(id,"ID=" + id + "无效--@HystrixCommand","无有效数据库");
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list(){
        return productService.list();
    }
}
