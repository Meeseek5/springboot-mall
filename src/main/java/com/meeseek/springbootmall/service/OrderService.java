package com.meeseek.springbootmall.service;

import com.meeseek.springbootmall.dto.CreateOrderRequest;
import com.meeseek.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
