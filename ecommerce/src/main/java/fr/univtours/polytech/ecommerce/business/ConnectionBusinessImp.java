package fr.univtours.polytech.ecommerce.business;

import fr.univtours.polytech.ecommerce.DAO.UserDAO;
import jakarta.inject.Inject;

public class ConnectionBusinessImp implements ConnectionBusiness{

    @Inject
    private UserDAO userDAO;

    @Override
    public boolean getUserWithLogin(String Login, String Password) {
        return userDAO.getUserWithLogin(Login, Password);
    }
}
