FROM openjdk:latest
COPY ./target/priinglesPracticeSE-0.1.0.3-jar-with-dependencies.jar /tmp
WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "priinglesPracticeSE-0.1.0.3-jar-with-dependencies.jar"]