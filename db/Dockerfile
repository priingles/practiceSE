FROM mysql:8.3

#set working directory
WORKDIR /tmp

#files copied to container working directory
COPY .db/test_db/*.sql /tmp/test_db
COPY .db/test_db/*.dump /tmp/test_db

COPY ./db/test_db/employees.sql /docker-entrypoint-initdb.d

ENV MYSQL_ROOT_PASSWORD example

