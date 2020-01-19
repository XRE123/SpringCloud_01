package com.mxy.springcloud.controller;

import com.mxy.springcloud.entities.Product;
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
public class ProductController_Consumer {

    public static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/product/add")
    public Boolean add(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }

}
