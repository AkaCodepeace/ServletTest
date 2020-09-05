package cn.codepeace.service;


import cn.codepeace.pojo.User;

import java.sql.Connection;

public interface UserService {
    User login(String username, String password);

    int register(String username, String password);

    User queryUserByUsername(String username);

}
