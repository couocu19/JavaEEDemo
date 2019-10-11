package servlet;

import bean.Friend;
import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "update",urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {

    ImplFriendService fs = new ImplFriendService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        int id = Integer.valueOf(req.getParameter("id"));
        Friend f = fs.getFriendService(id);

        req.setAttribute("friend",f);
        //req.setAttribute("id",id);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);

    }


}
