package com.fang.service;

import com.fang.domain.Orders;

import java.util.List;

public interface IOrdersService {
    public List<Orders> findAll();
    public Orders findById(String orderId);
}
