package com.example.sales_erp.service;

import com.example.sales_erp.model.ProductEntity;
import com.example.sales_erp.repo.ProductRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private JPAStreamer jpaStreamer;

    public ProductEntity getProductDetails(int id){
        return productRepo.findById(id).orElse(null);
    }

    public List<ProductEntity> getALlProductDetails(){
        List<ProductEntity> allProducts = productRepo.findAll();
        return allProducts;
    }

    public ProductEntity addProduct(ProductEntity product){
        ProductEntity p = ProductEntity.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .brandId(product.getBrandId())
                        .brandName(product.getBrandName())
                        .categoryId(product.getCategoryId())
                        .categoryName(product.getCategoryName())
                        .unitsLeft(product.getUnitsLeft())
                        .manufacturingCountry(product.getManufacturingCountry())
                        .unitsSold(product.getUnitsSold())
                        .rating(product.getRating())
                        .warranty(product.getWarranty())
                        .carbonEmission(product.getCarbonEmission())
                        .releaseDate(product.getReleaseDate())
                        .build();

        return productRepo.save(p);
    }

    public List<ProductEntity> getProductsByBrand(int brandId){
        return jpaStreamer.stream(ProductEntity.class)
               .filter(product -> product.getBrandId() == brandId)
               .toList();
    }

    public List<ProductEntity> getProductsUnderPrice(int price){
        return jpaStreamer.stream(ProductEntity.class)
               .filter(product -> product.getPrice() < price)
               .toList();
    }

    public List<Map.Entry<String, Long>> countProductsManufacturedByEachCoutry(){
        return jpaStreamer.stream(ProductEntity.class)
               .collect(Collectors.groupingBy(product -> product.getBrandName(), Collectors.counting()))
               .entrySet()
               .stream()
               .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
               .collect(Collectors.toList());
    }
}
