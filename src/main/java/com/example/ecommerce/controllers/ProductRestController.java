package com.example.ecommerce.controllers;

import com.example.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/api")

public class ProductRestController {

    @Autowired
    private ProductService productService;

    

}
