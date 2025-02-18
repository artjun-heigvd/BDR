SET search_path = pagila;

--
-- Triggers
---------------------------

-- BEGIN Exercice 01
CREATE OR REPLACE FUNCTION payment_insertion_func()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE payment
        SET amount = amount * 1.08,
            payment_date = now()

        WHERE payment_id = NEW.payment_id;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER payment_insertion
AFTER INSERT ON payment
    FOR EACH ROW
EXECUTE FUNCTION payment_insertion_func();

INSERT INTO payment (customer_id,staff_id,rental_id,amount,payment_date)
VALUES (1,1,1,100,TIMESTAMP '2004-10-19 10:23:54+02');
-- END Exercice 01

-- BEGIN Exercice 02
CREATE TABLE staff_creation_log (
    username VARCHAR(16),
    when_created TIMESTAMP WITH TIME ZONE DEFAULT now() NOT NULL
);

CREATE OR REPLACE FUNCTION insert_staff_creation_log()
RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO staff_creation_log (username)
    VALUES (NEW.username);

    RETURN NEW;
END;
    $$ LANGUAGE plpgsql;



CREATE OR REPLACE TRIGGER staff_creation_logging
AFTER INSERT ON staff
    FOR EACH ROW
EXECUTE FUNCTION insert_staff_creation_log();

INSERT INTO staff(first_name, last_name, address_id, store_id, username)
VALUES ('Jean-Claude','Van Damme',1,1,'JCVD');
-- END Exercice 02

-- BEGIN Exercice 03
CREATE OR REPLACE FUNCTION adjust_staff_email()
RETURNS TRIGGER AS
$$
BEGIN
    NEW.email := CONCAT(LOWER(NEW.first_name), '.', LOWER(NEW.last_name), '@sakilastaff.com');
    RETURN NEW;
END;
$$
LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER adjust_staff_email_event
BEFORE INSERT OR UPDATE
ON staff
FOR EACH ROW
EXECUTE FUNCTION adjust_staff_email();

-- test
UPDATE staff
SET first_name = 'Alice', last_name = 'Test'
WHERE staff_id = 1;

SELECT * FROM staff;
-- END Exercice 03

--
-- Vues
---------------------------

-- BEGIN Exercice 04
CREATE VIEW franklin_christmas_card
AS
    SELECT
        staff.first_name,
        staff.last_name,
        address.phone,
        address.address,
        address.postal_code,
        city.city
    FROM staff
        INNER JOIN address ON staff.address_id = address.address_id
        INNER JOIN city ON address.city_id = city.city_id;

--Test
SELECT * FROM franklin_christmas_card;
-- END Exercice 04

-- BEGIN Exercice 05
CREATE OR REPLACE VIEW franklins_view
AS
    SELECT

    EXTRACT(DAY FROM (INTERVAL '1 day' + (NOW() - (rental.rental_date + rental_duration * INTERVAL '1 day')))) AS jours_retard,
    film.title AS titre_film,
    customer.email
    FROM rental
    INNER JOIN inventory
        ON rental.inventory_id = inventory.inventory_id
    INNER JOIN film
        ON inventory.film_id = film.film_id
    INNER JOIN customer
        ON rental.customer_id = customer.customer_id
    WHERE rental.return_date IS NULL AND
        (NOW() - (rental.rental_date + film.rental_duration * INTERVAL '1 day')) > INTERVAL '0 day';

-- Test
SELECT * FROM franklins_view;
-- END Exercice 05

-- BEGIN Exercice 06
CREATE OR REPLACE VIEW clients_retardataires AS
    SELECT *
    FROM franklins_view
    WHERE jours_retard > 3;

-- END Exercice 06

-- BEGIN Exercice 07
CREATE OR REPLACE VIEW franklins_nb_location_per_client
AS
    SELECT
    rental.customer_id,
    rental_id,
    first_name,
    last_name
    FROM rental
    INNER JOIN customer
        ON rental.customer_id = customer.customer_id;



SELECT
    customer_id,
    first_name,
    last_name,
    COUNT(rental_id) AS nb_locations
    FROM franklins_nb_location_per_client
        GROUP BY customer_id,
                 first_name,
                 last_name
ORDER BY nb_locations DESC
LIMIT 20;

-- END Exercice 07

-- BEGIN Exercice 08
CREATE VIEW rentals_by_day
AS
    SELECT
        DATE(rental_date) AS day_of_rental,
        COUNT(rental_id) AS number_of_rentals
    FROM rental
    GROUP BY DATE(rental_date);

--Test de la question
SELECT
    *
FROM rentals_by_day
WHERE day_of_rental = '2005-07-05';
--Reponse :
-- Il y en a 27 !

-- END Exercice 08

--
-- Procédures / Fonctions
---------------------------

-- BEGIN Exercice 09
CREATE OR REPLACE FUNCTION get_films_count_in(id INT)
RETURNS INT
LANGUAGE plpgsql
AS
$$
DECLARE
	count INTEGER;
BEGIN
	SELECT COUNT(DISTINCT film_id) INTO count FROM store
	INNER JOIN inventory ON inventory.store_id = store.store_id
	WHERE store.store_id = id;
	RETURN count;
END;
$$;

-- Test
SELECT get_films_count_in(1);
SELECT get_films_count_in(2);
-- END Exercice 09

-- BEGIN Exercice 10
-- La date de mise à jour des films avant la procédure est de :
-- 2017-09-10 17:46:03.905795 +00:00
-- Après avoir fait la procédure elle est datée du :
-- 2023-12-03 09:24:48.836348 +00:00

CREATE OR REPLACE PROCEDURE update_film_last_update_date()
language plpgsql
AS
$$
BEGIN
    UPDATE film
    SET last_update = NOW();
END;

$$;
-- Pour ensuite utiliser la procedure
CALL update_film_last_update_date();

-- END Exercice 10

--
-- SQL Avancé
---------------------------

-- BEGIN Exercice 11
WITH RECURSIVE distance_3_short_actor AS(
    SELECT
        fa2.actor_id,
        1 AS distance
    FROM film_actor as fa1
             INNER JOIN actor ON actor.actor_id = fa1.actor_id
             INNER JOIN film ON fa1.film_id = film.film_id
             INNER JOIN film_actor AS fa2 ON fa2.film_id = film.film_id
    WHERE film.length < 50 AND actor.first_name = 'ED'
      AND actor.last_name = 'GUINESS' AND fa1.actor_id != fa2.actor_id
    UNION
    SELECT
        fa2.actor_id,
        distance + 1
    FROM distance_3_short_actor AS a1
             INNER JOIN film_actor AS fa1 ON a1.actor_id = fa1.actor_id
             INNER JOIN film ON film.film_id = fa1.film_id
             INNER JOIN film_actor AS fa2 ON fa2.film_id = fa1.film_id
    WHERE distance + 1 < 3 AND film.length < 50 AND fa2.actor_id != (
        SELECT actor_id FROM actor WHERE first_name = 'ED' AND last_name = 'GUINESS')
)
SELECT DISTINCT
    actor_id
FROM distance_3_short_actor;
-- END Exercice 11

-- BEGIN Exercice 12
SELECT payment_id, customer_id, payment_date, amount,
	SUM(amount)
		OVER (PARTITION BY customer_id
			ORDER BY payment_date) as cumulative_amount
FROM payment
-- END Exercice 12
