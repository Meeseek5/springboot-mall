package com.meeseek.springbootmall.service;

import com.meeseek.springbootmall.dto.CreateOrderRequest;
import com.meeseek.springbootmall.dto.OrderQueryParams;
import com.meeseek.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
