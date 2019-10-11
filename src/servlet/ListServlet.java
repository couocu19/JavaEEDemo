package servlet;

import bean.Friend;

import service.ImplFriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet",urlPatterns = "/ListServlet")
public class ListServlet extends HttpServlet {

    ImplFriendService fs = new ImplFriendService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        List<Friend> list = new ArrayList<>();
        list = fs.listFriendService();
        if(list!=null){
            req.setAttribute("friends",list);
            req.getRequestDispatcher("/list.jsp").forward(req,resp);
        }else{
            req.setAttribute("isNull",1);
            req.getRequestDispatcher("/list.jsp").forward(req,resp);
        }

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
