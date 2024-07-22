package com.aub.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @RequestMapping("/list")
    public String list(){
        return "product-list";
    }
    
}
