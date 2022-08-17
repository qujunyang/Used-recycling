package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.OrderItem;
import org.apache.ibatis.annotations.Mapper;


public interface OrderItemDAO {

    public int insertOrderItem(OrderItem orderItem);

}
