package app.servlets;

import app.bd.PetRepositoryImpl;
import app.entities.pets.SavedPets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class PetsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        PetRepositoryImpl repository = new PetRepositoryImpl();
        ArrayList<SavedPets> savedPets = (ArrayList<SavedPets>) repository.listPets((id));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("JSPViews/listPet.jsp");
        requestDispatcher.forward(req,resp);
    }
}
