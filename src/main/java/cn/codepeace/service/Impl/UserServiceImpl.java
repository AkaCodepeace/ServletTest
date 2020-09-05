package cn.codepeace.service.Impl;

import cn.codepeace.dao.Impl.UserDaoIml;
import cn.codepeace.dao.UserDao;
import cn.codepeace.pojo.User;
import cn.codepeace.service.UserService;
import cn.codepeace.util.JdbcUtil;

import java.sql.Connection;


public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoIml();
    }

    public User login(String username, String password) {
        User user = null;
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            user = userDao.getLoginUser(username,password,con);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.clean(con, null, null);
        }
        return  user;
    }

    public int register(String username, String password) {
        Connection con = null;
        int updateRow = 0;
        try {
            con = JdbcUtil.getConnection();
            updateRow = userDao.register(username, password, con);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.clean(con,null,null);
        }

        return updateRow;
    }

    public User queryUserByUsername(String param) {
        User user = null;
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            user = userDao.queryUserByUsername(param, con);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.clean(con,null,null);
        }
        return user;
    }

}
