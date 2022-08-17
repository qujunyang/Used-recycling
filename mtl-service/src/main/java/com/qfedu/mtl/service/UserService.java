package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.User;

public interface UserService {
    public User check(String userName,String userPwd);
}
