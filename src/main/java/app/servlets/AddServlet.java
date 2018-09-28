package app.servlets;

import app.bd.RepositoryImpl;
import app.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("JSPViews/add.jsp");
        dispatcher.forward(req,resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");

        User user = new User(name, password);

      /*  Model model = Model.getInstance();
        if (!model.find(name)){
            model.add(user);
            req.setAttribute("added", true);
        }else {
            req.setAttribute("added", false);
        }*/

        RepositoryImpl baseRepository = new RepositoryImpl();
        if (baseRepository.findUser(name) == -1){
            baseRepository.addUser(user);
            req.setAttribute("added", true);
        }else {
            req.setAttribute("added", false);
        }

        doGet(req, resp);
    }
}
