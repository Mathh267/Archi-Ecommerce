<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste des Articles</title>
</head>
<body>
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
</body>
</html>
