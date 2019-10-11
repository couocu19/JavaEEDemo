package servlet;

import bean.Friend;
import service.FriendService;
import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet",urlPatterns = "/AddServlet")
public class AddServlet extends HttpServlet {
    FriendService fs = new ImplFriendService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        String locate = req.getParameter("locate");
        String phonenum = req.getParameter("phonenum");
        Friend f = new Friend(name,locate,phonenum);
        fs.addFriendService(f);
        resp.getWriter().println("录入成功！");

        resp.sendRedirect("/Demo_war_exploded/ListServlet");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
