FROM openjdk:17-jdk-alpine
COPY target/docker-0.0.1-SNAPSHOT.jar appdocker.jar
ENTRYPOINT ["java", "-jar", "appdocker.jar"]