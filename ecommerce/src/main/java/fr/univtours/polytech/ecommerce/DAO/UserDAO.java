package fr.univtours.polytech.ecommerce.DAO;

import fr.univtours.polytech.ecommerce.model.UserBean;

public interface UserDAO {

    public UserBean getUserWithLogin(String login,String Password);

}
