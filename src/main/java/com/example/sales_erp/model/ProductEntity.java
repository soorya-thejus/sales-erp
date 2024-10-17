package com.example.sales_erp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "product-details")
@Entity
@Builder
public class ProductEntity {

    @Id
    private int id;
    private String name;
    private String description;
    private int price;
    private int brandId;
    private String brandName;
    private int categoryId;
    private String categoryName;
    private int unitsLeft;
    private String manufacturingCountry;
    private int unitsSold;
    private int rating;
    private int warranty;
    private String carbonEmission;
    private String releaseDate;
}
