package cn.zk.servlet;

import cn.zk.biz.ItopicBiz;
import cn.zk.biz.IuserBiz;
import cn.zk.biz.UserBiz.TopicBiz;
import cn.zk.biz.UserBiz.UserBiz;
import cn.zk.entity.Topic;
import cn.zk.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/htmnl;charset=UTF-8");
        String uName = request.getParameter("name");
        String uPass = request.getParameter("pwd");
        IuserBiz iuserBiz = new UserBiz();
        User user = iuserBiz.userLogin(uName,uPass);
        ItopicBiz itopicBiz = new TopicBiz();
        List<Topic> ls = itopicBiz.getAllTopic();
        HttpSession session = request.getSession();
        if(user != null){
            session.setAttribute("user",user);
            session.setAttribute("ls",ls);
            request.getRequestDispatcher("main.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
