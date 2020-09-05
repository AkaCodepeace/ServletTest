package cn.codepeace.dao.Impl;

import cn.codepeace.dao.UserDao;
import cn.codepeace.pojo.User;
import cn.codepeace.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDaoIml implements UserDao {

    public User getLoginUser(String username, String password, Connection con) throws SQLException {
        User user = null;
        PreparedStatement pst = null;
        ResultSet rs  = null;

        if (con != null){
            String sql = "select * from `user` WHERE `username`= ? and `password` = ?";
            Object [] params = {username,password};
            rs = JdbcUtil.execute(con, pst, rs, sql, params);
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            JdbcUtil.clean(null,pst,rs);

        }
        return user;

    }

    public int register(String username, String password, Connection con) throws SQLException {
        int updateRow = 0;
        PreparedStatement pst = null;
        if (con != null){
            Object [] params = {username,password};
            String sql = "INSERT INTO `user`(`username`,`password`) VALUES( ?,?)";
            updateRow = JdbcUtil.execute(con, pst, sql, params);
            JdbcUtil.clean(null,pst,null);
        }

        return updateRow;
    }

    public User queryUserByUsername(String username, Connection con) throws SQLException {
        User user = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        if (con != null){
            Object[] params ={username};
            String sql = "select * from `user` WHERE `username`= ? ";
            rs = JdbcUtil.execute(con, pst, rs, sql, params);
            if (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            JdbcUtil.clean(null,pst,rs);
        }
        return user;

    }


}
