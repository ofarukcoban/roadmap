FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/tracing-server-0.0.1-SNAPSHOT.jar tracing-server.jar
ENTRYPOINT ["java", "-jar", "/tracing-server.jar"]
EXPOSE 8080