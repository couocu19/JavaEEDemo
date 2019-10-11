package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChooseServlet",urlPatterns = "/ChooseServlet")
public class ChooseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String choose = req.getParameter("choose");
        if(choose.equals("查看所有朋友列表")){
            resp.sendRedirect("/Demo_war_exploded/ListServlet");

        }else if(choose.equals("添加朋友")){
            resp.sendRedirect("/Demo_war_exploded/add.jsp");
        }
        else if(choose.equals("退出")){
            resp.sendRedirect("/Demo_war_exploded/index.jsp");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
