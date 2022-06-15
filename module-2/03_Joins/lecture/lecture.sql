-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database

SELECT city_name , state_abbreviation
FROM city
WHERE city_name = 'Columbus';



-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT city_name , state_name
FROM city
JOIN state ON city.state_abbreviation = state.state_abbreviation
WHERE city_name = 'Columbus';


-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT park_name, state_abbreviation
FROM park
JOIN park_state ON park.park_id = park_state.park_id;


-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT park_name, state_name
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state ON park_state.state_abbreviation = state.state_abbreviation;


-- Modify the previous query to include the name of the state's capital city.
SELECT park_name, state_name, city_name AS capital
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state ON park_state.state_abbreviation = state.state_abbreviation
JOIN city ON state.capital = city.city_id;


-- Modify the previous query to include the area of each park.
SELECT park_name, state_name, capital, park.area
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state ON park_state.state_abbreviation = state.state_abbreviation;


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT  city_name AS cities_in_midwest, city.population
FROM city
JOIN state ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest';


-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.
SELECT state.state_name, COUNT (city_name) AS number_of_cities_in_midwest
FROM city
JOIN state ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY state.state_name;

-- Modify the previous query to sort the results by the number of cities in descending order.
SELECT state.state_name, COUNT (city_name) AS number_of_cities_in_midwest
FROM city
JOIN state ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY state.state_name
ORDER BY number_of_cities_in_midwest DESC;




-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that 
-- state (or territory) for every record in the state table that has park records associated with it.

SELECT state_name, MIN (park.date_established) AS Earliest_state_park_established_date
FROM state
JOIN park_state ON state.state_abbreviation = park_state.state_abbreviation
JOIN park ON park_state.park_id = park.park_id
GROUP BY state.state_name;




-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.
SELECT state_name, MIN (park.date_established) AS Earliest_state_park_established_date
FROM state
LEFT JOIN park_state ON state.state_abbreviation = park_state.state_abbreviation
LEFT JOIN park ON park_state.park_id = park.park_id
GROUP BY state.state_name;




-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. 
--(Washington is the name of a city and a state--how many times does it appear in the results?)
SELECT city_name AS place_name
FROM city
WHERE city_name LIKE 'W%'
UNION
SELECT state_name
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name;


-- Modify the previous query to include a column that indicates whether the place is a city or state.



-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres


-- The titles of all the Comedy movies

