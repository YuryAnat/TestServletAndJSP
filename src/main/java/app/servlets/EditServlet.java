package app.servlets;

import app.bd.RepositoryImpl;
import app.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("JSPViews/edit.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String newName = req.getParameter("newName");
        String password = req.getParameter("pass");

        RepositoryImpl repository = new RepositoryImpl();
        if (repository.findUser(name) != -1){
            User newUser = new User(newName,password);
            repository.updateUser(repository.findUser(name),newUser);
            req.setAttribute("passed",true);
        }else {
            req.setAttribute("passed",false);
        }

//        Model model = Model.getInstance();
//        if (model.find(name)){
//            model.update(name,newName,password);
//            req.setAttribute("passed",true);
//        }else {
//            req.setAttribute("passed",false);
//        }

        doGet(req,resp);
    }
}
