package com.mxy.springcloud.entities;

import java.io.Serializable;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/16 19:56
 * @description：
 * @modified By：
 * @version: $
 */
public class Product implements Serializable{
    private Long pid;//主键    
    private String productName;//产品名称    
    // 来自哪个数据库
    private String dbSource;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
