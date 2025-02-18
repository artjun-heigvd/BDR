SET search_path = pagila;

-- BEGIN Exercice 01
SELECT
    customer_id,
    last_name AS nom,
    email
FROM customer
WHERE
    first_name = 'PHYLLIS' AND store_id = 1
ORDER BY customer_id DESC;
-- END Exercice 01


-- BEGIN Exercice 02
SELECT
    title AS titre,
    release_year AS annee_sortie
FROM film
WHERE rating = 'R' AND length < 60 AND replacement_cost = 12.99
ORDER BY title;
-- END Exercice 02


-- BEGIN Exercice 03
SELECT
    country,
    city,
    postal_code
FROM address
INNER JOIN city ON address.city_id = city.city_id
INNER JOIN country ON city.country_id = country.country_id
WHERE country = 'France' OR (city.country_id  >= 63 AND city.country_id <= 67)
ORDER BY country,city,postal_code;
-- END Exercice 03


-- BEGIN Exercice 04
SELECT
    customer.customer_id,
    customer.first_name AS prenom,
    customer.last_name AS nom
FROM customer
    INNER JOIN address ON customer.address_id = address.address_id
WHERE address.city_id = 171 AND customer.store_id = 1 AND customer.active = true
ORDER BY prenom;
-- END Exercice 04


-- BEGIN Exercice 05
SELECT
    c1.first_name AS prenom_1,
    c1.last_name AS nom_1,
    c2.first_name AS prenom_2,
    c2.last_name AS nom_2
FROM rental AS r1
    INNER JOIN customer AS c1 ON r1.customer_id = c1.customer_id
    INNER JOIN inventory AS i1 ON r1.inventory_id = i1.inventory_id
    INNER JOIN rental AS r2 ON r1.customer_id < r2.customer_id
    INNER JOIN customer AS c2 ON r2.customer_id = c2.customer_id
    INNER JOIN inventory AS i2 ON r2.inventory_id = i2.inventory_id
WHERE i1.film_id = i2.film_id;
-- END Exercice 05


-- BEGIN Exercice 06
SELECT
    first_name AS prenom,
    last_name AS nom
FROM actor,film_actor,film,film_category,category
WHERE actor.actor_id = film_actor.actor_id
AND film_actor.film_id = film.film_id
AND film.film_id = film_category.film_id
AND film_category.category_id = category.category_id
AND category.name = 'Horror'
AND (actor.first_name LIKE 'K%' OR actor.last_name LIKE 'D%');
-- END Exercice 06


-- BEGIN Exercice 07a
SELECT film_id AS id, title AS titre, (rental_rate / rental_duration) AS prix_de_location_par_jour FROM film
WHERE (rental_rate / rental_duration) <= 1.00 
AND (SELECT COUNT(inventory_id) FROM inventory
    WHERE inventory.film_id = film.film_id) = 0;
-- END Exercice 07a

-- BEGIN Exercice 07b
SELECT film_id AS id, title AS titre, (rental_rate / rental_duration) AS prix_de_location_par_jour FROM film
WHERE film_id not in (
	SELECT film_id AS id FROM film
	WHERE (rental_rate / rental_duration) > 1.00 
	OR NOT (SELECT COUNT(inventory_id) FROM inventory
	WHERE inventory.film_id = film.film_id) = 0
);
-- END Exercice 07b


-- BEGIN Exercice 08a
SELECT
    customer.customer_id AS id,
    last_name AS nom,
    first_name AS prenom
FROM customer
    INNER JOIN address ON customer.address_id = address.address_id
WHERE EXISTS(
    SELECT *
    FROM rental
    WHERE return_date IS NULL AND rental.customer_id = customer.customer_id
) AND EXISTS(
    SELECT *
    FROM city
    WHERE country_id = (SELECT country_id FROM country WHERE country.country = 'Spain') AND city.city_id = address.city_id
) ORDER BY last_name;
-- END Exercice 08a

-- BEGIN Exercice 08b
SELECT
    customer.customer_id AS id,
    last_name AS nom,
    first_name AS prenom
FROM customer
    INNER JOIN rental ON customer.customer_id = rental.customer_id
WHERE address_id IN (
    SELECT
        address_id
    FROM address
    WHERE city_id IN (
        SELECT city_id
        FROM city
        WHERE country_id = (SELECT country_id FROM country WHERE country.country = 'Spain')
        )
    ) AND return_date IS NULL
ORDER BY last_name;
-- END Exercice 08b

-- BEGIN Exercice 08c
SELECT
    customer.customer_id AS id,
    last_name AS nom,
    first_name AS prenom
FROM customer
    INNER JOIN address ON customer.address_id = address.address_id
    INNER JOIN city ON address.city_id = city.city_id
    INNER JOIN rental ON customer.customer_id = rental.customer_id
WHERE return_date IS NULL AND country_id = (SELECT country_id FROM country WHERE country.country = 'Spain')
ORDER BY last_name;
-- END Exercice 08c


-- BEGIN Exercice 09 (Bonus)
SELECT
	c.first_name AS prenom,
	c.last_name AS nom
FROM customer c
INNER JOIN rental r      ON c.customer_id   = r.customer_id
INNER JOIN inventory i   ON r.inventory_id  = i.inventory_id
INNER JOIN film f        ON i.film_id       = f.film_id
INNER JOIN film_actor fa ON f.film_id       = fa.film_id
INNER JOIN actor a       ON fa.actor_id     = a.actor_id
WHERE a.first_name = 'EMILY' AND a.last_name = 'DEE'
GROUP BY prenom,nom
HAVING COUNT(DISTINCT f.film_id) = (
    SELECT COUNT(DISTINCT film.film_id)
    FROM film
    INNER JOIN film_actor ON film.film_id = film_actor.film_id
    INNER JOIN actor ON film_actor.actor_id = actor.actor_id
    WHERE actor.first_name = 'EMILY' AND actor.last_name = 'DEE'
);
-- END Exercice 09 (Bonus)


-- BEGIN Exercice 10
SELECT 
	film.film_id,
	title AS titre,
	COUNT(actor_id) AS nb_acteurs
FROM film
INNER JOIN film_category ON film_category.film_id = film.film_id
INNER JOIN category ON category.category_id = film_category.category_id
INNER JOIN film_actor ON film.film_id = film_actor.film_id
WHERE category.name = 'Drama'
GROUP BY film.film_id
HAVING COUNT(actor_id) < 5;
-- END Exercice 10


-- BEGIN Exercice 11
SELECT
    category.category_id AS id,
    category.name,
    COUNT(film_id) AS nb_films
FROM category
INNER JOIN film_category ON category.category_id = film_category.category_id
GROUP BY
    id, category.name
HAVING COUNT(film_id) > 65
ORDER BY nb_films;
-- END Exercice 11


-- BEGIN Exercice 12
SELECT
    film_id AS id,
    title AS titre,
    length AS duree
FROM film
WHERE length = (
    SELECT MIN(length)
    FROM film
    );
-- END Exercice 12


-- BEGIN Exercice 13a
SELECT film.film_id AS id, title AS titre FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
WHERE film_actor.actor_id IN (
    SELECT actor.actor_id FROM actor
    INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
    GROUP BY actor.actor_id
    HAVING COUNT(film_actor.film_id) > 40
  )
ORDER BY titre;
-- END Exercice 13a

-- BEGIN Exercice 13b
SELECT film.film_id AS id, title AS titre FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN (
    SELECT actor.actor_id FROM actor
    INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
    GROUP BY actor.actor_id
    HAVING COUNT(film_actor.film_id) > 40
  ) AS big_actors
ON big_actors.actor_id = film_actor.actor_id
ORDER BY titre;
-- END Exercice 13b


-- BEGIN Exercice 14
SELECT
    SUM(length) / (8 * 60) AS nb_jours
FROM film;
-- END Exercice 14


-- BEGIN Exercice 15
SELECT
    id,
    nom,
    email,
    pays,
    nb_locations,
    depense_totale,
    depense_moyenne
FROM (
    SELECT
		c.customer_id AS id,
		c.last_name AS nom,
		c.email,
		co.country AS pays,
		COUNT(r.rental_id) AS nb_locations,
		SUM(p.amount) AS depense_totale,
		(SUM(p.amount) / COUNT(p.payment_id)) AS depense_moyenne
	FROM rental r
	INNER JOIN payment p ON r.rental_id = p.rental_id
	INNER JOIN customer c ON r.customer_id = c.customer_id
	INNER JOIN address a ON c.address_id = a.address_id
	INNER JOIN city ci ON a.city_id = ci.city_id
	INNER JOIN country co ON ci.country_id = co.country_id
	WHERE (co.country = 'Switzerland' OR co.country = 'France' OR co.country = 'Germany')
	GROUP  BY c.customer_id, c.last_name, c.email, co.country
) sous_requette
WHERE depense_moyenne > 3.0
ORDER BY pays, nom;
-- END Exercice 15


-- BEGIN Exercice 16a
SELECT COUNT(*) FROM payment
WHERE amount <= 9;
-- END Exercice 16a

-- BEGIN Exercice 16b
DELETE FROM payment
WHERE amount <= 9;
-- END Exercice 16b

-- BEGIN Exercice 16c
SELECT COUNT(*) FROM payment
WHERE amount <= 9;
-- END Exercice 16c

-- BEGIN Exercice 17
UPDATE payment
SET amount = CASE WHEN (amount > 4) THEN amount * 1.5 ELSE amount END, payment_date = NOW();
-- END Exercice 17


-- BEGIN Exercice 18
with city_insert AS (
    INSERT INTO city
    (city, country_id, last_update) VALUES ('Nyon',  
    (SELECT country_id FROM country WHERE country = 'Switzerland'), 
    NOW()) RETURNING city_id
)
, address_insert AS (
	INSERT INTO address
	(address, address2, district, city_id, postal_code, phone, last_update) VALUES ('Rue du centre', '', 'Vaud', (SELECT city_id FROM city_insert), 1260, '021/360.00.00', NOW()) RETURNING address_id
)
INSERT INTO customer
(store_id, first_name, last_name, email, address_id, active, create_date, last_update)
VALUES (1, 'Guillaume', 'Ransome', 'gr@bluewin.ch', (SELECT address_id FROM address_insert), true, NOW(), NOW());
-- END Exercice 18

-- BEGIN Exercice 18d
SELECT * FROM customer
INNER JOIN address ON address.address_id = customer.address_id
INNER JOIN city ON city.city_id = address.city_id
WHERE first_name = 'Guillaume' and last_name = 'Ransome'
-- END Exercice 18d
