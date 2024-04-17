package fr.univtours.polytech.ecommerce.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PanierBean implements Serializable {

    private List<ArticlePanierBean> items;

    public PanierBean() {
        this.items = new ArrayList<>();
    }

    public List<ArticlePanierBean> getItems() {
        return items;
    }

    // methode pour ajouter un article au panier
    public void addItem(ArticleBean article, int quantitéPanier) {
        for (ArticlePanierBean item : items) {
            if (item.getArticleBean().getId().equals(article.getId())) {
                item.setQuantitéPanier(item.getQuantitéPanier() + quantitéPanier);
                return;
            }
        }
        items.add(new ArticlePanierBean(article, quantitéPanier));
    }

    // methode pour enlevé l'item du panier
    public void removeItem(ArticleBean article, int quantitéPanier) {
        items.removeIf(item -> item.getArticleBean().getId().equals(article.getId())
                && (item.getQuantitéPanier() - quantitéPanier <= 0));
        items.forEach(item -> {
            if (item.getArticleBean().getId().equals(article.getId())) {
                item.setQuantitéPanier(item.getQuantitéPanier() - quantitéPanier);
            }
        });
    }

    // methode pour avoir la quantité d'un article specifique dans le panier
    public int getItemQuantité(Integer articleId) {
        return items.stream()
                .filter(item -> item.getArticleBean().getId().equals(articleId))
                .findFirst()
                .map(ArticlePanierBean::getQuantitéPanier)
                .orElse(0);

    }

    // methode pour avoir le prix totale
    public float getPrixTotal() {
        return (float) items.stream()
                .mapToDouble(item -> item.getArticleBean().getPrix() * item.getQuantitéPanier())
                .sum();
    }

}
