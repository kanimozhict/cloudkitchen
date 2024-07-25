package com.example.ecommerce.core;

import com.example.ecommerce.core.model.Order;

import java.util.List;

public interface IOrderService {

    List<Order> getOrders();

    List<String> getOrdersName();
}
