package com.fang.service.impl;

import com.fang.dao.IOrdersDao;
import com.fang.domain.Orders;
import com.fang.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class OrdersService implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String orderId){
        return ordersDao.findById(orderId);
    }
}
