package com.example.sales_erp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    @Min(value = 100, message = "Enter a valid Id")
    private int id;

    @NotBlank(message = "The username should not be empty")
    private String name;

    @Pattern(regexp = "^[0-9]$", message = "The price should contain numbers only")
    private int price;

    @Min(value = 1, message = "The brandId should be greater than 1")
    private int brandId;

    @NotBlank(message = "The brandName cannot be empty")
    private String brandName;

    @Min(value = 1, message = "The categoryId should be greater than 1")
    private int categoryId;

    @NotBlank(message = "The manufacturing country cannot be empty")
    private String manufacturingCountry;

    @Min(value = 1, message = "The warranty should not be less than 1 year")
    private int warranty;

    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}", message = "The date should be in the format of DD-MM-YYYY")
    private String releaseDate;

    private String description;
    private String categoryName;
    private int unitsLeft;
    private int unitsSold;
    private int rating;
    private String carbonEmission;

}
