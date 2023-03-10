# Сinema Shop

This project is a web application for cinema ticketing system with the ability of authentication in service.

## Features

- register or login as user
- create and find movies
- create and find movie sessions
- creating shopping cart
- add tickets to shopping cart
- complete an order

## Project structure

The web-application is built with implementation of Hibernate and Spring MVC. Thus, the project
has the following structure:
* Controllers - package responsible for user interface operations and informational interchange between user
  and application. Logic in classes is built via Spring MVC.
* Dao layer - stores and performs operations with data. Layer is realized via Hibernate framework.
* Model layer - stores information about entities and their properties.
* Service layer - contains classes responsible for business logic.
* Security layer - defines access rights to user according to user's role.

## Technologies

- Java
- Maven
- Spring MVC
- Spring Security
- Hibernate
- MySQL
- TomCat

## Application endpoints

These are active endpoints for web application:

HTTP method: endpoint - Action of request - Role with authority
- POST: /register - register user - user/admin
- GET: /cinema-halls - get list of cinema halls - user/admin
- POST: /cinema-halls - add cinema hall - admin
- GET: /movies - get list of movies - user/admin
- POST: /movies - add movie - admin
- GET: /movie-sessions/available - get available movie sessions - user/admin
- POST: /movie-sessions - add movie session - admin
- PUT: /movie-sessions/{id} - update movie session - admin
- DELETE: /movie-sessions/{id} - delete movie session - admin
- GET: /orders - get list of user's orders - user
- POST: /orders/complete - move tickets from shopping cart to newly created order - user
- PUT: /shopping-carts/movie-sessions - creation of ticket to specified movie session in user's shopping cart - user
- GET: /shopping-carts/by-user - get user's shopping cart - user
- GET: /users/by-email - get user by email - admin

## Application start

- Download MySQL and version of TomCat not higher than 9.0.71.
- Make a fork of this project by this [link][2].
- Configure file db.properties with your data.
- Configure TomCat in your IDE
- Run `mvn clean package` to check if there are any errors.
- If everything is correct you can run TomCat and use the application.

[1]: https://cdn-icons-png.flaticon.com/512/2699/2699194.png    "Image"
[2]: https://github.com/Gleb-Shevchenko/Cinema-Shop     "link"