FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root_password \
    MYSQL_DATABASE=my_database \
    MYSQL_USER=my_user \
    MYSQL_PASSWORD=my_password

EXPOSE 3306