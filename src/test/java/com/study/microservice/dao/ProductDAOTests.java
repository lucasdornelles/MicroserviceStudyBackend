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

import static org.junit.Assert.assertEquals;

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
        // given
        productDAO.save(new Product("testProduct", BigDecimal.ONE, "testCategory", 1));
        productDAO.save(new Product("testProduct", BigDecimal.ONE, "testCategory", 1));
        productDAO.save(new Product("testProduct", BigDecimal.ONE, "testCategory", 1));
        productDAO.save(new Product("testProduct", BigDecimal.ONE, "testCategory", 1));
        productDAO.save(new Product("testProduct", BigDecimal.ONE, "testCategory", 1));

        // when
        List<Product> list = productDAO.findByName("testProduct");

        // then
        assertEquals(list.get(0).getName(), "testProduct");
        assertEquals(list.get(0).getName(), "testProduct");
        assertEquals(list.get(0).getName(), "testProduct");
        assertEquals(list.get(0).getName(), "testProduct");
        assertEquals(list.get(0).getName(), "testProduct");
        assertEquals(list.get(0).getName(), "testProduct");
    }

    @Test
    public void shouldReturnMultipleItems() {
        // given
        addRandomProductsToDB(10);


    }

    private void addRandomProductsToDB(int i) {
        for (int j = 0; j < i; j++) {
            Product product = new Product(String.valueOf(i), BigDecimal.ONE, "category", 1);
            
            String lala = new String("^lala");

            String s = new String("^lala");
            
            
        }
    }
}
