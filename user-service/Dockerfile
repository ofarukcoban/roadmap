FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
ENTRYPOINT ["java", "-jar", "/user-service.jar"]
EXPOSE 8081