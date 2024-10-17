package com.example.sales_erp.controller;

import com.example.sales_erp.model.ProductEntity;
import com.example.sales_erp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProductDetails() {
        return productService.getALlProductDetails();
    }

    @GetMapping("/products/{id}")
    public ProductEntity getProductDetailsById(@PathVariable int id) {
        return productService.getProductDetails(id);
    }

    @GetMapping("/products/brand/{brandId}")
    public List<ProductEntity> getProductsByBrand(@PathVariable int brandId) {
        return productService.getProductsByBrand(brandId);
    }

    @GetMapping("/products/price/{price}")
    public List<ProductEntity> getProductsUnderPrice(@PathVariable int price){
        return productService.getProductsUnderPrice(price);
    }

    @PostMapping("/products")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products/country")
    public List<Map.Entry<String, Long>> countProductsManufacturedByEachCoutry(){
        return productService.countProductsManufacturedByEachCoutry();
    }

    @GetMapping("/abc")
            public String test()  // Test endpoint to check if the application is running properly
    {
        return "Success";
    }
}
