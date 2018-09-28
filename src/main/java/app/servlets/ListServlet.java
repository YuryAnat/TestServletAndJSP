package app.servlets;

import app.bd.RepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        Model model = Model.getInstance();
//        List<String> names = model.list();
        RepositoryImpl repository = new RepositoryImpl();
        List<String> names = repository.listUser();

        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("JSPViews/list.jsp");
        requestDispatcher.forward(req,resp);
    }
}
