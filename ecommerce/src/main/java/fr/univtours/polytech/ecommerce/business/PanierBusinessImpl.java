package fr.univtours.polytech.ecommerce.business;

import java.util.List;

import fr.univtours.polytech.ecommerce.DAO.ArticleDAO;
import fr.univtours.polytech.ecommerce.model.ArticleBean;
import fr.univtours.polytech.ecommerce.model.ArticlePanierBean;
import jakarta.inject.Inject;

public class PanierBusinessImpl implements PanierBusiness {

    @Inject
    private ArticleDAO ArticleDAO;

    @Override
    public Float ComputeTotalArticlePanier(List<ArticlePanierBean> ListeArticlePanier) {
        if (ListeArticlePanier.isEmpty()){
            return 0F;
        }
        else {
            float somme=0F;
            for (ArticlePanierBean ArticlePanier : ListeArticlePanier){
                somme=somme+ArticlePanier.getQuantitéPanier()*ArticlePanier.getArticleBean().getPrix();
            }
            return somme;
        }
    }

    @Override
    public List<ArticlePanierBean> addArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,
            ArticlePanierBean ArticlePanier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ArticlePanierBean> addQuantiteArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,
            ArticleBean Article, Integer Quantité) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ArticlePanierBean> delQuantiteArticlePanierBean(List<ArticlePanierBean> ListeArticlePanier,
            ArticleBean Article, Integer Quantité) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ArticleBean> getArticles() {
        return ArticleDAO.getArticleList();
    }

    


    
}
