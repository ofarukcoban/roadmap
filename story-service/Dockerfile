FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
VOLUME /tmp
ADD target/story-service-0.0.1-SNAPSHOT.jar story-service.jar
ENTRYPOINT ["java", "-jar", "/story-service.jar"]
EXPOSE 8083