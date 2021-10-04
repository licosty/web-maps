## Задание:
1. На основе имеющейся ERD (файл bd.drawio) создать базу данных.(Открывать через https://www.draw.io/)
2. Внести тестовые данные (от 2 до 5 записей для таблицы).
3. Разработать приложение (Spring Boot) для доступа к созданной базе данных с помощью Rest API в формате json.

На основе имеющихся данных в БД создать следующие методы Rest API:
1. **/cities** – перечень городов с указанием количества домов
2. **/streets** – перечень улиц с указанием количества домов с запросом по городу */streets?city_id={city_id}*
3. **/houses** – перечень домов с указанием полного адреса и количества квартир с запросом по конкретной улице / городу  */houses?city_id={city_id}* и */houses? street_id={street_id}*

---
Использованные технологии:

- [Maven];
- [Spring Boot];
- [Spring Data JPA];
- [MySQL].

[maven]:<https://maven.apache.org/download.cgi>
[spring boot]:<https://www.baeldung.com/spring-with-maven>
[spring data jpa]:<https://www.baeldung.com/spring-with-maven>
[mysql]:<https://dev.mysql.com/downloads/mysql/>