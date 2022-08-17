package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Order;
import org.apache.ibatis.annotations.Mapper;


public interface OrderDAO {
    public int insertOrder(Order order);
}
