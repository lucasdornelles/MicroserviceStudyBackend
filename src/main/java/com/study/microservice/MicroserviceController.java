package com.study.microservice;

import com.study.microservice.dao.ProductService;
import com.study.microservice.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroserviceController {

    ProductService productService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello, World!";
    }

    @RequestMapping("/products")
    @ResponseBody
    public Iterable<Product> getProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("/postproduct")
    public ResponseEntity postProduct(
            @RequestBody Product product) {
        productService.postProduct(product);
        return ResponseEntity.ok(HttpStatus.OK);
    }


}
