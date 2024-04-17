package fr.univtours.polytech.ecommerce.business;

import java.util.List;

import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.PanierBean;

public interface PanierBusiness {

    public List<ArticleBean> getArticles();

    public PanierBean addQuantiteArticlePanierBean(PanierBean Panier,ArticleBean Article,Integer Quantité);

    public PanierBean delQuantiteArticlePanierBean(PanierBean Panier,ArticleBean Article,Integer Quantité);

    public Float ComputeTotalArticlePanier(PanierBean Panier);
}
