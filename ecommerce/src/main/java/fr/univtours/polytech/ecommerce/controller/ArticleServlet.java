package fr.univtours.polytech.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import fr.univtours.polytech.ecommerce.business.PanierBusiness;
import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.ArticlePanierBean;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ArticleServlet", urlPatterns = { "/Article" })
public class ArticleServlet extends HttpServlet {

	@Inject
	private PanierBusiness PanierBusiness;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		@SuppressWarnings("unchecked")
		List<ArticlePanierBean> ListeArticlePanier = (List<ArticlePanierBean>) session.getAttribute("ListeArticlePanier");

		List<ArticleBean> ListeArticle = PanierBusiness.getArticles();

		if(ListeArticlePanier != null){
			request.setAttribute("ARTICLEPANIER_LIST", ListeArticlePanier);
		}
		if (ListeArticle != null ){
			request.setAttribute("ARTICLE_LIST", ListeArticle);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

}
