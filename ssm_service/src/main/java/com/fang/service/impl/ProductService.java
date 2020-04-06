package com.fang.service.impl;

import com.fang.dao.IProductDao;
import com.fang.domain.Product;
import com.fang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    private IProductDao productDao;
    public List<Product> findAll()throws Exception {
        return productDao.findAll();
    }

    public void saveProduct(Product product)throws Exception {
        productDao.saveProduct(product);
    }
}
