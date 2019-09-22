package com.study.microservice.dao;

import com.study.microservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public void postProduct(Product product) {
        productDAO.save(product);
    }

    public Iterable<Product> getAllProducts() {
        return productDAO.findAll();
    }
}
