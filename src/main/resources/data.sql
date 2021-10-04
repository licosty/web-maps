INSERT INTO cities(name)
VALUES ('Краснодар'),
       ('Ярославль'),
       ('Екатеринбург');

INSERT INTO streets(name, city_id)
VALUES ('Восточно-Кругликовская', 1),
       ('Жлобы', 1),
       ('Пушкина', 2),
       ('Куйбышева', 3);

INSERT INTO houses(number, street_id)
VALUES ('20', 1),
       ('139', 2),
       ('17', 3),
       ('20', 3),
       ('57', 4);

INSERT INTO apartments(area, house_id)
VALUES (63.7, 1),
       (38.9, 2),
       (32.5, 3),
       (28.3, 4),
       (40.6, 5);