FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
VOLUME /tmp
ADD target/corporation-service-0.0.1-SNAPSHOT.jar corporation-service.jar
ENTRYPOINT ["java", "-jar", "/corporation-service.jar"]
EXPOSE 8082