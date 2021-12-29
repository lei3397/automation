FROM adoptopenjdk/openjdk11:alpine

COPY build/libs/spring-demo-0.0.1-SNAPSHOT.jar ws.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/ws.jar"]