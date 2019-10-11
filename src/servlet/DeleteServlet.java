package servlet;

import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete",urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {

    ImplFriendService fs = new ImplFriendService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        int id = Integer.valueOf(req.getParameter("id"));
        fs.deleteFriendService(id);
        resp.getWriter().println("删除成功！");

        resp.sendRedirect("/Demo_war_exploded/ListServlet");

    }


}
