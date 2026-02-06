# Task

A Java spring boot application built with Maven, REST API for task management with JPA and H2 database

## Technologies
- Java (25)
- Spring boot
- Maven
- Docker / Docker Compose

### Core Dependencies
- `spring-boot-starter-web`
- `spring-boot-starter-validation`
- `spring-boot-starter-data-jpa`
- `h2` (runtime)

## Getting Started
### Prerequisites
Make sure you have the following installed:

- Java JDK 25
- Maven 3.6+ (or use the included Maven Wrapper `./mvnw`)
- Docker & Docker Compose
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java/Spring extension

### features
[Built with Devtiro](https:www.youtube.com/@devtiro).
1. Create a task.
2. List tasks.
3. Update a task.
4. Delete a task.

### Run locally
```bash
# Build
mvn clean package

# Run the JAR (adjust path/version)
java -jar target/task-1.0-SNAPSHOT.jar
```
Run with Docker
```Bash
docker-compose up --build
```
