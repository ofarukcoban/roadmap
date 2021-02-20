FROM openjdk:11-jdk-slim
MAINTAINER ofarukcoban
ADD target/config-server-0.0.1-SNAPSHOT.jar /config-server.jar
RUN bash -c 'touch /config-server.jar'
ENTRYPOINT ["java", "-jar", "/config-server.jar"]
EXPOSE 8888