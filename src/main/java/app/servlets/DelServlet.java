package app.servlets;

import app.bd.RepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("JSPViews/delete.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        RepositoryImpl repository = new RepositoryImpl();
        if (repository.findUser(name) != -1){
            repository.deleteUser(repository.findUser(name));
            req.setAttribute("delUser",true);
        }else {
            req.setAttribute("delUser",false);
        }

//        Model model = Model.getInstance();
//        if (model.find(name)){
//            model.del(name);
//            req.setAttribute("delUser",true);
//        }else {
//            req.setAttribute("delUser",false);
//        }

        doGet(req,resp);
    }
}
