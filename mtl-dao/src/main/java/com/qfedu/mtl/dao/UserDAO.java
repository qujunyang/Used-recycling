package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserDAO {
    public User selectUserByUserName(String username);
}
