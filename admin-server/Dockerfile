FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
VOLUME /tmp
ADD target/admin-server-0.0.1-SNAPSHOT.jar admin-server.jar
ENTRYPOINT ["java", "-jar", "/admin-server.jar"]
EXPOSE 9090