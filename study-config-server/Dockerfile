FROM openjdk:8-jdk-alpine
MAINTAINER Jorge Lunardelli <jorgel@ciandt.com>
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]