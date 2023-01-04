package com.meeseek.springbootmall.dao;

import com.meeseek.springbootmall.constant.ProductCategory;
import com.meeseek.springbootmall.dto.ProductQueryParams;
import com.meeseek.springbootmall.dto.ProductRequest;
import com.meeseek.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
