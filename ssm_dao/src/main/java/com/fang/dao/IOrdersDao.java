package com.fang.dao;

import com.fang.domain.Member;
import com.fang.domain.Orders;
import com.fang.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderTimeStr",column = "orderTimeStr"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId" , javaType = Product.class,one=@One(select = "com.fang.dao.IProductDao.findById") ),
    })
    public List<Orders> findAll();

    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderTimeStr",column = "orderTimeStr"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId" , javaType = Product.class,one=@One(select = "com.fang.dao.IProductDao.findById") ),
            @Result(property = "member",column = "memberId" , javaType = Member.class,one=@One(select = "com.fang.dao.IMemberDao.findById") ),
            @Result(property = "travellers",column = "id" , javaType = java.util.List.class,many=@Many(select = "com.fang.dao.ITravellerDao.findById") ),
    })
    public Orders findById(String orderId);
}
