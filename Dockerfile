FROM openjdk:latest
COPY ./target/classes/priingles /tmp/priingles
WORKDIR /tmp

ENTRYPOINT ["java", "priingles.personal.Main"]