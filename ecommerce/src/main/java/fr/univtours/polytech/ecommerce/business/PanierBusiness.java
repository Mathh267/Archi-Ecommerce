package fr.univtours.polytech.ecommerce.business;

import java.util.List;

import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.ArticlePanierBean;

public interface PanierBusiness {

    public List<ArticleBean> getArticles();
    
    public List<ArticlePanierBean> addArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,ArticlePanierBean ArticlePanier);

    public List<ArticlePanierBean> addQuantiteArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,ArticleBean Article,Integer Quantité);

    public List<ArticlePanierBean> delQuantiteArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,ArticleBean Article,Integer Quantité);

    public Float ComputeTotalArticlePanier(List<ArticlePanierBean> ListeArticlePanier);
}
