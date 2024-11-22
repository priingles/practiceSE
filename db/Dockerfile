FROM mysql:8.3

#set working directory
WORKDIR /tmp

#files copied to container working directory
COPY ./test_db/*.sql /tmp
COPY ./test_db/*.dump /tmp

COPY test_db/employees.sql /docker-entrypoint-initdb.d

ENV MYSQL_ROOT_PASSWORD example