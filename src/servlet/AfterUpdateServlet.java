package servlet;

import bean.Friend;
import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AfterUpdateServlet",urlPatterns = "/AfterUpdateServlet")
public class AfterUpdateServlet extends HttpServlet {

    ImplFriendService fs = new ImplFriendService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String locate = req.getParameter("locate");
        String phonenum = req.getParameter("phone");

        Friend f = new Friend(id,name,locate,phonenum);
        fs.updateFriendService(f);

        resp.sendRedirect("/Demo_war_exploded/ListServlet");

    }
}
