# Escolhe uma imagem base com Maven e JDK para compilar o projeto
FROM maven:3.9.5-eclipse-temurin-17 AS build

# Define o diretório de trabalho para a fase de build
WORKDIR /app

# Copia os arquivos do projeto para dentro do container
COPY pom.xml .
COPY src ./src

# Faz o download das dependências e compila o projeto
RUN mvn clean package -DskipTests

# Escolhe uma imagem base leve para a execução
FROM eclipse-temurin:17-jre-alpine

# Define o diretório de trabalho para a aplicação
WORKDIR /app

# Copia o JAR gerado na fase de build para o container
COPY --from=build /app/target/assistenciawebsistema-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
