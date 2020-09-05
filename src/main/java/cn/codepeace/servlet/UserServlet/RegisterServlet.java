package cn.codepeace.servlet.UserServlet;

import cn.codepeace.pojo.User;
import cn.codepeace.service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserServiceImpl userService = new UserServiceImpl();
        User  user= userService.queryUserByUsername(username);

        if (user != null && username.equals(user.getUsername())) {
            req.setAttribute("error","用户名存在，请重新输入");
            req.getRequestDispatcher("static/jsp/register.jsp").forward(req,resp);
        }else {
            userService.register(username,password);
            resp.sendRedirect("static/jsp/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
