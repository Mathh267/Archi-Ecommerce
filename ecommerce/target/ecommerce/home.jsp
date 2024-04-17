<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste des Articles</title>
    <style>
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Liste des Articles</h1>
    <table>
        <thead>
            <tr>
                <th>Nom</th>
                <th>Prix</th>
                <th>Stock</th>
                <th>Modifier Quantité</th>
            </tr>
        </thead>
        <tbody>
            <!-- Exemple d'articles listés -->
            <tr>
                <td>Article 1</td>
                <td>10.00 €</td>
                <td>5</td>
                <td>
                    <a href="#add1">+</a> <a href="#remove1">-</a>
                </td>
            </tr>
            <tr>
                <td>Article 2</td>
                <td>20.00 €</td>
                <td>8</td>
                <td>
                    <a href="#add2">+</a> <a href="#remove2">-</a>
                </td>
            </tr>
            <!-- Ajoutez plus d'articles selon la même structure -->
        </tbody>
    </table>
    <div style="text-align: center;">
        <a href="CartPage">Voir le panier</a>
    </div>
</body>
</html>
