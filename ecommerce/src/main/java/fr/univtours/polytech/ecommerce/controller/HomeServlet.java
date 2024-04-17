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
import jakarta.servlet.http.HttpSession;




@WebServlet(name="HomeServlet", urlPatterns = {"/Home"})
public class HomeServlet extends HttpServlet {

    @Inject
    private ConnectionBusiness ConnectionBusiness;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String Login = (String) session.getAttribute("Login");
        if (Login != null){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Article");
            dispatcher.forward(request, response);
        }

        else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
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
                
                HttpSession session = request.getSession();
                session.setAttribute("Login", Login);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Article");
                dispatcher.forward(request, response);
            }
    }

}