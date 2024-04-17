
<html>
<head>
    <title>Liste des articles</title>
</head>
<body>
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
</body>
</html>