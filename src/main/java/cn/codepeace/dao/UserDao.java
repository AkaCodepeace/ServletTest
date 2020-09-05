package cn.codepeace.dao;

import cn.codepeace.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

public interface UserDao {
    User getLoginUser(String username, String password, Connection con) throws SQLException;

    int register(String username, String password, Connection con) throws SQLException;

    User queryUserByUsername(String username,  Connection con) throws SQLException;
}
