package com.example.ecommerce.services;

import com.example.ecommerce.models.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public Product addProduct(Product product){
        return this.productRepository.save(product);
    }


    public Product getProductById(long id) {
        Optional<Product> optional = this.productRepository.findById(id);

        Product product = null;

        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException("Product not found");
        }
        return product;
    }

    



}
