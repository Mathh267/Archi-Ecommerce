package fr.univtours.polytech.ecommerce.controller;

import java.io.IOException;

import fr.univtours.polytech.ecommerce.business.PanierBusiness;
import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.PanierBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "removeServlet", urlPatterns = { "/remove" })
public class removeServlet extends HttpServlet {

    @Inject
    private PanierBusiness PanierBusiness;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String articleId = request.getParameter("articleId");
        PanierBean Panier = (PanierBean) session.getAttribute("Panier");
        ArticleBean Article = PanierBusiness.getArticles().stream()
                .filter(item -> item.getId().equals(Integer.parseInt(articleId))).findFirst().get();
        if (Panier == null) {

            response.sendRedirect(request.getContextPath() + "/Article");
        }
        Panier.removeItem(Article, 1);
        session.setAttribute("Panier", Panier);
        response.sendRedirect(request.getContextPath() + "/Article");
    }

}