package cn.codepeace.servlet.UserServlet;

import cn.codepeace.pojo.User;
import cn.codepeace.service.Impl.UserServiceImpl;
import cn.codepeace.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.login(username, password);
        if (user != null && password.equals(user.getPassword()) && username.equals(user.getUsername())) {
            req.getSession().setAttribute(Constants.USER_SESSION,user);
            resp.sendRedirect("static/jsp/admin/admin.jsp");
        }else {
            req.setAttribute("error","用户名或密码错误");
            req.getRequestDispatcher("static/jsp/admin/login.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
