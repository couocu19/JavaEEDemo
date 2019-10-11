package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ManagerServlet",urlPatterns = "/ManagerServlet")
public class ManagerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String defaultPass = "123456";
        //resp.setContentType("utf-8");
        req.setCharacterEncoding("utf-8");
        //String manager = req.getParameter("manager");
        String password = req.getParameter("password");
        if(password.equals(defaultPass)){
            resp.sendRedirect("/Demo_war_exploded/show.jsp");

        }else{
            req.setAttribute("msg","登录密码错误~请重新输入！");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
