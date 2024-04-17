package fr.univtours.polytech.ecommerce.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");

		if (username == null) { ///a modifier
			String messageError = "login ou mot de passe incorrect";
			request.setAttribute("MESSAGE", messageError);
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else {

			
			request.getRequestDispatcher("home.jsp").forward(request, response);

		}

	}
}