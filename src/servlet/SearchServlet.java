package servlet;

import bean.Friend;
import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "search",urlPatterns = "/search")
public class SearchServlet extends HttpServlet {

    ImplFriendService fs = new ImplFriendService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        resp.setContentType("utf-8");

        String info = req.getParameter("info");

        List<Friend> list = fs.searchFriendService(info);

        req.setAttribute("list",list);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);

    }

}
