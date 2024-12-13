FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/crud-cadescolar-0.0.1-SNAPSHOT.jar
COPY target/crud-cadescolar.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]