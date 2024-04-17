package fr.univtours.polytech.ecommerce.DAO;

import java.util.List;

import fr.univtours.polytech.ecommerce.model.UserBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class UserDAOImplJPA implements UserDAO{
    // L'objet EntityManager qui va permettre d'effectuer les requêtes en BDD.
    @PersistenceContext(unitName = "Ecommerce")
    private EntityManager em;

    @SuppressWarnings("unchecked") 
    @Override
    public Boolean getUserWithLogin(String login,String Password){
        Query requete = em.createNativeQuery("select * from user where Login='"+login+"' AND Password='"+Password+"'", UserBean.class);
        List<UserBean> ListeUser = requete.getResultList();
        return !ListeUser.isEmpty();
    }
}
