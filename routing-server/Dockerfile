FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/routing-server-0.0.1-SNAPSHOT.jar routing-server.jar
ENTRYPOINT ["java", "-jar", "/routing-server.jar"]
EXPOSE 8080