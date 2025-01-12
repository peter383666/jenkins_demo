FROM java:8
MAINTAINER wujintao@itcast.cn
VOLUME /tmp
ARG BUILD_NAME
ADD $BUILD_NAME/target/$BUILD_NAME.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]