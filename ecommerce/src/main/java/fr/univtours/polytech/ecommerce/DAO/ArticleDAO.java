package fr.univtours.polytech.ecommerce.DAO;

import java.util.List;

import fr.univtours.polytech.ecommerce.model.ArticleBean;

public interface ArticleDAO {

    public List<ArticleBean> getArticleList();

    public void addQuantiteArticle(ArticleBean article,int Quantité);

    public void delQuantiteArticle(ArticleBean article,int Quantité);

}
