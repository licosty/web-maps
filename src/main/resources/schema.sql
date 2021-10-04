DROP TABLE IF EXISTS apartments;
DROP TABLE IF EXISTS houses;
DROP TABLE IF EXISTS streets;
DROP TABLE IF EXISTS cities;

CREATE TABLE cities
(
    id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE streets
(
    id      INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    city_id INT          NOT NULL REFERENCES cities (id)
);

CREATE TABLE houses
(
    id        INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    number    VARCHAR(50) NOT NULL,
    street_id INT         NOT NULL REFERENCES streets (id)
);

CREATE TABLE apartments
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    area     FLOAT(15, 2) NOT NULL,
    house_id INT          NOT NULL REFERENCES houses (id)
);