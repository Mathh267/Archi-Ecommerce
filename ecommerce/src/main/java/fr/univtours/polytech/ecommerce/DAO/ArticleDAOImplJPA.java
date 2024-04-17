package fr.univtours.polytech.ecommerce.DAO;

import java.util.List;

import fr.univtours.polytech.ecommerce.model.ArticleBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ArticleDAOImplJPA implements ArticleDAO{
    // L'objet EntityManager qui va permettre d'effectuer les requêtes en BDD.
    @PersistenceContext(unitName = "Ecommerce")
    private EntityManager em;

    @SuppressWarnings("unchecked") 
    @Override
    public List<ArticleBean> getArticleList() {
        // Exemple de requête HQL (ou JPAQL).
        Query requete = em.createNativeQuery("select * from article", ArticleBean.class);
        return requete.getResultList();
    }

    @Override
    public void addQuantiteArticle(ArticleBean article,int Quantité){
        article.setNbRestant(article.getNbRestant()+Quantité);
    }

    
    @Override
    public void delQuantiteArticle(ArticleBean article,int Quantité){
        article.setNbRestant(article.getNbRestant()-Quantité);
    }


}
