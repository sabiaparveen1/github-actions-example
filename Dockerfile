FROM openjdk:17-jdk-alpine
ARG JARFILE=target/*.jar
COPY ./target/github-actions-example-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]