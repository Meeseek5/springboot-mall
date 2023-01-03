package com.meeseek.springbootmall.dao;

import com.meeseek.springbootmall.dto.ProductRequest;
import com.meeseek.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);
}
