FROM openjdk:latest
COPY ./target/priinglesPracticeSE-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "priinglesPracticeSE-1.0-SNAPSHOT-jar-with-dependencies.jar"]