package com.example.sales_erp.repo;

import com.example.sales_erp.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}

