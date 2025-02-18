# Rapport labo 3 - BDR

## Exos
Voici les résultats de toutes les commandes pour chaque exercice.

### 1
![exo1.png](screens%2Fexo1.png)
### 2
![exo2.png](screens%2Fexo2.png)
### 3
![exo3.png](screens%2Fexo3.png)
### 4
![exo4.png](screens%2Fexo4.png)
### 5
![exo5.png](screens%2Fexo5.png)
### 6
![exo6.png](screens%2Fexo6.png)
### 7
a)

![exo7a.png](screens%2Fexo7a.png)

b)

![exo7b.png](screens%2Fexo7b.png)

### 8
a)

![exo8a.png](screens%2Fexo8a.png)

b)

![exo8b.png](screens%2Fexo8b.png)

c)

![exo8c.png](screens%2Fexo8c.png)

### 9
![exo9.png](screens%2Fexo9.png)
### 10
![exo10.png](screens%2Fexo10.png)
### 11
![exo11.png](screens%2Fexo11.png)
### 12
![exo12.png](screens%2Fexo12.png)
### 13
a)

![exo13a.png](screens%2Fexo13a.png)

b)

![exo13b.png](screens%2Fexo13b.png)

### 14
![exo14.png](screens%2Fexo14.png)
### 15
![exo15.png](screens%2Fexo15.png)
### 16
a)

![exo16a.png](screens%2Fexo16a.png)

c)

![exo16c.png](screens%2Fexo16c.png)
### 18

b) Nous ne connaissons par le dernier ID inséré sur notre dernier INSERT INTO, donc nous utilisons un WITH pour stocker l'ensemble de retour contentant l'ID de l'insertion précédente.

c) Notre solution n'a pas besoin d'être executée dans une transaction au final car l'ID utilisée est celle retournée à l'insertion précédente.

d) Résultat (en JSON pour la lisibilité) :

```json
[
  {
    "customer_id": 600,
    "store_id": 1,
    "first_name": "Guillaume",
    "last_name": "Ransome",
    "email": "gr@bluewin.ch",
    "address_id": 606,
    "active": true,
    "create_date": "2023-11-19 13:40:11.779334 +00:00",
    "last_update": "2023-11-19 13:40:11.779334 +00:00",
    "address": "Rue du centre",
    "address2": "",
    "district": "Vaud",
    "city_id": 601,
    "postal_code": "1260",
    "phone": "021/360.00.00",
    "city": "Nyon",
    "country_id": 91
  }
]
```