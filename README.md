# Technical Assistance System Project

This Project Aims to Create a Service Order System for Technical Assistance in a Joint and Complete Way, to Help Technicians Issue Their Services to Companies and Others

## Technologies Used

We used the following technologies in the Project to make the Back-end API of such system

<div align="left">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="100" />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="90" />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/hibernate/hibernate-original.svg" width="90"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original.svg" width="90"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/mysql/mysql-original.svg" width="90"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postman/postman-original.svg" width="90"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/swagger/swagger-original.svg" width="90"/>
</div>

<br>

- Java
- Spring Boot
- Hibernate
-Docker
- MySQL
-Postman
- Swagger

## commands to use in Docker in the complete project

```bash
 docker run -d --name my-database-project --env-file .env -p 3306:3306 mysql:latest
```

- Build the image:

```bash
docker build -t my-mysql-image .
```

- Every time you change the application code, you need to rebuild the image with:

```bash
docker-compose build
```

- Run a container based on the created image:

```bash
docker run -d --name my-database -p 3306:3306 my-mysql-image
```
- Check if the container is running:

```bash
docker ps -a
```

- Using to access MySQL inside the docker Terminal

```bash
docker exec -it mysql mysql -u root -p
```

- Command to create docker-compose

```bash
docker-compose up -d
```

- Start the Services: Run the command:

```bash
docker-compose up --build
```

- Request URL for Swagger documentation

```bash
http://localhost:8080/swagger-ui.html
```

- Normal URL of the application

```bash
http://localhost:8080/
```

- Build the Docker Image: Run the command below in the terminal where the Dockerfile is:

```bash
docker build -t assistenciawebsistema .
```

- Run the Container: Run the following command to run the container:

```bash
docker run -p 8080:8080 assistenciawebsistema
```

- Rebuilding the project

```bash
docker build -t assistenciawebsistema:latest . ```

- Explaining that in application.properties, you can configure Springdoc to serve API documentation:

```bash
springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true
```

- Commands to Upload Environments
- For Development: Use the .env.dev file to load the environment variables:

```bash
docker-compose --env-file .env.dev up
```

- For Production: Use the .env.prod file - - to load the environment variables:

```bash
docker-compose --env-file .env.prod up
```

- Run the command below in the project directory to check if the JAR is generated correctly:

```bash
./mvnw clean package
```

- After the above command, the JAR must be generated in target/. Test locally:

```bash
java -jar target/assistenciawebsistema-0.0.1-SNAPSHOT.jar
```

- Maven already performs an automatic cleanup of the target directory when running the command ./mvnw clean package, but you can ensure manual removal:

```bash
./mvnw clean
```
- Build the image:

```bash
docker build -t spring-boot-app .
```

- Run the container:

```bash
docker run --env-file .env.prod -p 4425:8080 --name spring-boot-app spring-boot-app
```