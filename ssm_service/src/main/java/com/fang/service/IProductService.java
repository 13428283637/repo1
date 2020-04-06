package com.fang.service;

import com.fang.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll()throws Exception;
    public void saveProduct(Product product)throws Exception;
}
