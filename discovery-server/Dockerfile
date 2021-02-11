FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/discovery-server-0.0.1-SNAPSHOT.jar discovery-server.jar
ENTRYPOINT ["java", "-jar", "/discovery-server.jar"]
EXPOSE 8761