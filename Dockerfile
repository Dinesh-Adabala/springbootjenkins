FROM openjdk:17-jdk-alpine

COPY ./target/* .jar springbootdemok8s.jar

ENTRYPOINT ["java" ,"-jar","/springbootdemok8s.jar"]
