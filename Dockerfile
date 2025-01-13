FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root_password \
    MYSQL_DATABASE=my_database \
    MYSQL_USER=root \
    MYSQL_PASSWORD=root

EXPOSE 3306