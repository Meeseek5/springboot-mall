package com.meeseek.springbootmall.service.impl;

import com.meeseek.springbootmall.dao.ProductDao;
import com.meeseek.springbootmall.model.Product;
import com.meeseek.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
