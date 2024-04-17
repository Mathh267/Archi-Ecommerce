<<<<<<< HEAD
<!DOCTYPE html>
<html>
=======
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr">
>>>>>>> 5efe9cdbe311ded027accc5ddd8a12932caa0877
<head>
    <title>Liste des articles</title>
</head>
<body>
<<<<<<< HEAD
    <h1>Bienvenue</h1> 
    <a href="">Déconnexion</a>
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
    </table>
    <a href="">Voir le panier</a>
=======
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
      <c:forEach items="${ARTICLE_LIST}" var="article">
          <tr>
              <td>${article.name}</td>
              <td>${article.prix}</td>
              <td>${article.nbRestant}</td>
              <td>
                <form method="post" action="remove">
                    <input type="hidden" name="articleId" value="${article.id}">
                    <input type="submit" value="-">
                </form>
            </td>
              <td>${PANIER.getItemQuantité(article.id)}</td>
              <td>
              <form method="post" action="add">
                <input type="hidden" name="articleId" value="${article.id}">
                <input type="submit" value="+">
            </form>
          </td>
          </tr>
      </c:forEach>-->
  </table>
  <a href="">Voir le panier</a>
>>>>>>> 5efe9cdbe311ded027accc5ddd8a12932caa0877
</body>
</html>