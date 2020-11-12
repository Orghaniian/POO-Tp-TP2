# Extensions
===
## Spring Web
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

## Spring Data JPA
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

## Hibernate
 object-relational mapping tool for the Java programming language. It provides a framework for mapping an object-oriented domain model to a relational database. Hibernate handles object-relational impedance mismatch problems by replacing direct, persistent database accesses with high-level object handling functions. 
 
## H2 Database
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

## Spring Boot DevTools
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.


## Thymeleaf 
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.

  

# Questions 
===
### Etape 13
1. 
    ```java
    @GetMapping("/greeting")
    ```
2. 
    ```java
    return "greeting";
    ```
3. Methode HTTP `GET`

### Etape 17
la table ```ADDRESS``` est apparu dans l'arberescence à gauche

### Etape 18
@Entity indique à hibernate que ADDRESS est un tableau de la base de données

### Etape 20
OUI
| ID | CONTENT                              | CREATION   |
|----|--------------------------------------|------------|
| 1  | 57 boulevard demorieux               | 2020-11-12 |
| 2  | 51 allee du gamay, 34080 montpellier | 2020-11-12 |

### Etape 23
C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application

### Etape 30
Ajout de 
```
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
```
puis utilisation des classes bootstrap
