package com.study.microservice.dao;

import com.study.microservice.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductDAOTests {

    @Autowired
    private ProductDAO productDAO;

    @Test
    public void injectComponentIsNotNull(){
        Assert.assertNotNull(productDAO);
    }

    @Test
    public void addAndReturnProduct(){

        Product product = new Product("testProduct", BigDecimal.ONE, "testDescription", 1);

        productDAO.save(product);

        //Check if database contains product by name;

        List<Product> list = productDAO.findByName("testProduct");
        if (list == null)
        {
            Assert.fail("testProduct not found");
        }
        else
        {
            for (Product product1 : list)
            {
                System.out.println("found product: " + product);
            }
        }

    }
}
