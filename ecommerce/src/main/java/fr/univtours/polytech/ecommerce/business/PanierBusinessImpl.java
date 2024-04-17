package fr.univtours.polytech.ecommerce.business;

import java.util.List;

import fr.univtours.polytech.ecommerce.DAO.ArticleDAO;
import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.PanierBean;
import jakarta.inject.Inject;

public class PanierBusinessImpl implements PanierBusiness {

    @Inject
    private ArticleDAO ArticleDAO;

    @Override
    public Float ComputeTotalArticlePanier(PanierBean Panier) {
        if (Panier.getItems().isEmpty()) {
            return 0F;
        } else {
            return Panier.getPrixTotal();
        }
    }

    @Override
    public List<ArticleBean> getArticles() {
        return ArticleDAO.getArticleList();
    }

    @Override
    public PanierBean addQuantiteArticlePanierBean(PanierBean Panier, ArticleBean Article, Integer Quantité) {
        Panier.addItem(Article, Quantité);
        return Panier;
    }

    @Override
    public PanierBean delQuantiteArticlePanierBean(PanierBean Panier, ArticleBean Article, Integer Quantité) {
        Panier.removeItem(Article, Quantité);
        return Panier;
    }

}
