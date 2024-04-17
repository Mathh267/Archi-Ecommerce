<<<<<<< HEAD

<html>
=======
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
>>>>>>> fc8bc923262a12f06bb4d434380afe60a95167b8
<head>
    <title>Liste des articles</title>
</head>
<body>
<<<<<<< HEAD
    <h1>Bienvenue, ${sessionScope.currentUser}</h1> 
    <a href="logout">Déconnexion</a>
    <h2>Liste des articles</h2>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prix</th>
            <th>Restant</th>
            <th>Enlever 1 au panier</th>
            <th>Actuellement dans votre panier</th>
            <th>Ajouter 1 au panier</th>
        </tr>
        <!--<c:forEach items="${ARTICLE_LIST}" var="article">
            <tr>
                <td>${}</td> nom
                <td>${}</td> prix
                <td>${}</td> nbRestant
                <td><a href="">-</a></td> pour enlever 
                <td>${}</td> panier.getItemQuantity(article.id)
                <td><a href="">+</a></td> pour ajouter 
            </tr>
        </c:forEach>-->
    </table>
    <a href="">Voir le panier</a>
=======
<h1>Liste des Articles</h1>
<table>
    <thead>
      <tr>
        <th scope="col">Nom</th>
        <th scope="col">Prix</th>
        <th scope="col">Restant</th>
        <th scope="col">      </th>
        <th scope="col">Enlever 1 au panier</th>
        <th scope="col">Actuellement dans votre panier</th>
        <th scope="col">Ajouter 1 au panier</th>
      </tr>
    </thead>
    <tbody>
        <c:forEach items="${requestScope.ARTICLE_LIST}" var="article">
          <tr>
              <td>${article.name}</td>
              <td>${article.prix}</td>
              <td>${article.nbRestant}</td>
          </tr>
      </c:forEach>
      </tr>
    </tbody>
  </table>
  <input type="submit" value="Afficher le panier">
>>>>>>> fc8bc923262a12f06bb4d434380afe60a95167b8
</body>
</html>