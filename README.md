## Spring Boot | Observability

Dans ce repo, nous allons voir un exemple "Observability" - Spring Boot. Une façon de voir le temps de réponse d'une
REST API.

### Technologies
---

- Java 17
- Spring Boot 3
- Spring Data JPA
- Lombok
- MapStruct
- Maven 3+
- PostgreSQL

### Exécuter et tester les APIs
---

- Exécuter l'application `mvn spring-boot:run`
- Importer dans Postman la collection `spring-boot-observability.postman_collection.json` pour tester les APIs
- Vous pouver utiliser aussi l'url du Swagger ou importer l'url Swagger dans Postman. Les descriptions OpenAPI seront
  disponibles au chemin `/v3/api-docs` par défaut :
    - http://localhost:8081/v3/api-docs/
    - http://localhost:8081/swagger-ui/index.html
