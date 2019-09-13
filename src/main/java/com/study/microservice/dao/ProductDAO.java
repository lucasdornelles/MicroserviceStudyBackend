package com.study.microservice.dao;

import com.study.microservice.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends CrudRepository<Product, Long> {

    public List<Product> findByName(String name);

    public List<Product> findByCategory(String category);

}
