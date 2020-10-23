FROM maven:3.6.3 AS build

COPY pom.xml /build/

COPY src /build/src/

WORKDIR /build/

RUN mvn package

FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY --from=build /build/target/*.jar /app/spring-boot-app.jar

ENTRYPOINT ["java", "-jar","/app/spring-boot-app.jar"]
