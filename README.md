# Projeto Sistema Assistencia Tecnica

Esse Projeto Tem como Intuito de Cria um sistema para ordem de serviço para assistencias tecnicas de forma conjunta e total, para ajudar os tecnicos a emitir seus serviços para empresas e outros 

## Tecnologias Utilizadas 

Utilizamos no Projeto as seguintes tecnologias para fazer a API Back-end de tal sistema

<div align="left">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="100" />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="90"/>
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
- Docker 
- MySQL
- Postman
- Swagger

## comandos para usar no Docker no projeto completo 

```
 docker run -d --name my-database-project --env-file .env -p 3306:3306 mysql:latest 
```

- Construir a imagem:

```bash
docker build -t my-mysql-image .
```

- Rodar um container baseado na imagem criada:

```bash
docker run -d --name my-database -p 3306:3306 my-mysql-image 
```
- Verificar se o container está rodando:

```bash
docker ps -a
```

- Apagar a images do Docker 

```bash
docker rmi -f <id-conteiner>
```

- Acessar o banco de dados pelo docker

```bash
docker exec -it my-database-project mysql -u root -p
```