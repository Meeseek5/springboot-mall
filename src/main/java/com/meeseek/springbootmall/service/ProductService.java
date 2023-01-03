package com.meeseek.springbootmall.service;

import com.meeseek.springbootmall.dto.ProductRequest;
import com.meeseek.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
