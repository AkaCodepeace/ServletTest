package cn.codepeace.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    private static String username = null;
    private static String password = null;
    private static String driver = null;
    private static String url = null;

    static {
        InputStream in = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            Properties properties = new Properties();
            properties.load(in);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static  boolean clean(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        boolean flag = true;
       if (resultSet != null){
           try {
               resultSet.close();
               resultSet = null;
           } catch (SQLException e) {
               flag = false;
               e.printStackTrace();
           }
       }

        if (preparedStatement != null){
            try {
                preparedStatement.close();
                preparedStatement = null;
            } catch (SQLException e) {
                flag = false;
                e.printStackTrace();
            }
        }

        if (connection != null){
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                flag = false;
                e.printStackTrace();
            }
        }
        return flag;
    }

    public static ResultSet execute(Connection con, PreparedStatement pst, ResultSet rs, String sql, Object[] params) throws SQLException {
        pst = con.prepareStatement(sql);
        for (int i = 0; i<params.length; i++) {
            pst.setObject(i+1,params[i]);
        }
        rs = pst.executeQuery();
        return rs;
    }

    public static int execute(Connection con, PreparedStatement pst, String sql, Object[] params) throws SQLException {
        pst = con.prepareStatement(sql);
        for (int i=0; i<params.length; i++) {
            pst.setObject(i+1,params[i]);
        }
        int updateRow = pst.executeUpdate();
        return updateRow;
    }

}
