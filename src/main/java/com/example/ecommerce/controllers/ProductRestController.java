package com.example.ecommerce.controllers;

import com.example.ecommerce.models.Product;
import com.example.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/api")

public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();}

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product saveProducts(@RequestBody Product product){
      return  productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id ){
        productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product updateProduct){
        return productService.updateProduct(id, updateProduct);
    }


}
