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