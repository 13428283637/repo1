package com.fang.dao;


import com.fang.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellerDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{travellerId})")
    public List<Traveller> findById() throws Exception;
}
