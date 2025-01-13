FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=root_password \
    MYSQL_DATABASE=my-database-project \
    MYSQL_USER=my_user \
    MYSQL_PASSWORD=my_password

EXPOSE 3308