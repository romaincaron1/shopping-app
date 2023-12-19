package com.romaincaron.orderservice.controller;

import com.romaincaron.orderservice.dto.OrderRequest;
import com.romaincaron.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest OrderRequest) {
        orderService.placeOrder(OrderRequest);
        return "Order placed successfully";
    }
}
