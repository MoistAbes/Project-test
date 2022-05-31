package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

    @GetMapping
    public List<ProductDto> getProducts(){
        return new ArrayList<>();
    }

    public ProductDto getProduct(Long productId){
        return new ProductDto(1L, "Test title", "Test content", 150);
    }

    public void deleteProduct(Long productId){

    }

    public ProductDto updateProduct(ProductDto productDto){
        return new ProductDto(1L, "Edited test title", "Edited test content", 200);
    }

    public void createProduct(ProductDto productDto){

    }
}
