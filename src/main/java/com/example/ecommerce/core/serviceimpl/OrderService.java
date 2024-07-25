package com.example.ecommerce.core.serviceimpl;

import com.example.ecommerce.core.IOrderService;
import com.example.ecommerce.core.mapper.OrderMapper;
import com.example.ecommerce.core.mapper.OrderNameMapper;
import com.example.ecommerce.core.model.Order;
import com.example.ecommerce.core.model.OrderName;
import lombok.RequiredArgsConstructor;
import com.example.ecommerce.persistence.repo.OrderNameRepository;
import com.example.ecommerce.persistence.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderNameMapper nameMapper;
    private final OrderNameRepository nameRepository;

    @Override
    public List<Order> getOrders() {
        return orderMapper.toModel(orderRepository.findAll());
    }

    @Override
    public List<String> getOrdersName() {
//        List<OrderName> orderNames=  nameMapper.toModel(nameRepository.findAll());
       return nameMapper.toModel(nameRepository.findAll()).stream().map(OrderName::getName).toList();
    }
}
