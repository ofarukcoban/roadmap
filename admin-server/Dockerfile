FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/admin-server-0.0.1-SNAPSHOT.jar /admin-server.jar
RUN bash -c 'touch /admin-server.jar'
ENTRYPOINT ["java", "-jar", "/admin-server.jar"]
EXPOSE 9090