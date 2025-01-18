<<<<<<< HEAD
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
=======
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

```bash
 docker run -d --name my-database-project --env-file .env -p 3306:3306 mysql:latest 
```

- Construir a imagem:

```bash
docker build -t my-mysql-image .
```

- Cada vez que você altera o código da aplicação, precisa rebuildar a imagem com:

```bash
docker-compose build
```

- Rodar um container baseado na imagem criada:

```bash
docker run -d --name my-database -p 3306:3306 my-mysql-image 
```
- Verificar se o container está rodando:

```bash
docker ps -a
```

- Usando para acessa o MySQL dentro do Terminal do docker

```bash
docker exec -it mysql mysql -u root -p
```

- Comando para criar o docker-compose 

```bash
docker-compose up -d
```

- Iniciar os Serviços: Execute o comando:

```bash
docker-compose up --build
```

- URL da requisicao para a documentacao do Swagger 

```bash
http://localhost:8080/swagger-ui.html
```

- URL normal da aplicacao 

```bash
http://localhost:8080/
```

- Construir a Imagem Docker: Execute o comando abaixo no terminal onde está o Dockerfile:

```bash
docker build -t assistenciawebsistema .
```

- Executar o Container: Execute o seguinte comando para rodar o container:

```bash
docker run -p 8080:8080 assistenciawebsistema
```

- Fazendo um Rebuild do projeto 

```bash
docker build -t assistenciawebsistema:latest .
```

- Explicando que no application.properties, você pode configurar o Springdoc para servir a documentação da API:

```bash
springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true
```

- Comandos para Subir os Ambientes
- Para Desenvolvimento: Use o arquivo .env.dev para carregar as variáveis de ambiente:

```bash
docker-compose --env-file .env.dev up
```

- Para Produção: Use o arquivo .env.prod - - para carregar as variáveis de ambiente:

```bash
docker-compose --env-file .env.prod up
```

- Execute o comando abaixo no diretório do projeto para verificar se o JAR é gerado corretamente:

```bash
./mvnw clean package
```

- Após o comando acima, o JAR deve ser gerado em target/. Teste localmente:

```bash
java -jar target/assistenciawebsistema-0.0.1-SNAPSHOT.jar
```

- O Maven já executa uma limpeza automática do diretório target ao rodar o comando ./mvnw clean package, mas você pode garantir a remoção manual:

```bash
./mvnw clean
```


>>>>>>> documentacao-web
