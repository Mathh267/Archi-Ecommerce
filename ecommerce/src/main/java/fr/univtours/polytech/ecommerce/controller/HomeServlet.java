package fr.univtours.polytech.ecommerce.controller;

import java.io.IOException;

import fr.univtours.polytech.ecommerce.business.ConnectionBusiness;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeServlet", urlPatterns = { "/HomeServlet" })
public class HomeServlet extends HttpServlet {

    @Inject
    private ConnectionBusiness ConnectionBusiness;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String Login = request.getParameter("username");
            String Password = request.getParameter("password");

            if(!ConnectionBusiness.getUserWithLogin(Login, Password)){
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginerror.jsp");
                dispatcher.forward(request, response);
            }
            else{
                RequestDispatcher dispatcher = request.getRequestDispatcher("/acceuil");
                dispatcher.forward(request, response);
            }
    }

}