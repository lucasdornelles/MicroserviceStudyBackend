package com.study.microservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroserviceController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello, World!";
    }
}
