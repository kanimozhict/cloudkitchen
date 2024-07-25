package com.example.ecommerce.api;

import com.example.ecommerce.core.IOrderService;
import com.example.ecommerce.core.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class CommonController {

    private final IOrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {

       return orderService.getOrders();
       
    }
    @GetMapping("/names")
    public List<String> getAllOrdersName() {

        return orderService.getOrdersName();

    }
}
