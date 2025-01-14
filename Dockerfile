FROM openjdk:8-jdk-alpine
MAINTAINER peter6666
VOLUME /tmp
ARG BUILD_NAME
ADD $BUILD_NAME/target/$BUILD_NAME.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]