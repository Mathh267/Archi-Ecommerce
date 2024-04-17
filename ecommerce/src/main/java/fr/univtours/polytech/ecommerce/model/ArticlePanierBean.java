package fr.univtours.polytech.ecommerce.model;

import java.io.Serializable;

//Bean étant utile au panier puisque la quantité du panier n'est pas en base de données.
public class ArticlePanierBean implements Serializable{

    private ArticleBean articleBean;
    private int quantitéPanier;



    public ArticlePanierBean(ArticleBean articleBean,int quantitéPanier){
        this.articleBean=articleBean;
        this.quantitéPanier=quantitéPanier;
    }


    public ArticleBean getArticleBean() {
        return articleBean;
    }
    public void setArticleBean(ArticleBean articleBean) {
        this.articleBean = articleBean;
    }
    public int getQuantitéPanier() {
        return quantitéPanier;
    }
    public void setQuantitéPanier(int quantitéPanier) {
        this.quantitéPanier = quantitéPanier;
    }


 
}
