FROM amazoncorretto:17-alpine-jdk
MAINTAINER FedeG
COPY target/demo-0.0.1-SNAPSHOT.jar AP-app.jar
ENTRYPOINT ["java", "-jar","/AP-app.jar"]