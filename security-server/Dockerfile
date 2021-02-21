FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
VOLUME /tmp
ADD target/security-server-0.0.1-SNAPSHOT.jar security-server.jar
ENTRYPOINT ["java", "-jar", "/security-server.jar"]
EXPOSE 8080