FROM openjdk:8-jdk-alpine

VOLUME /tmp
COPY target/*.jar fps-app-ws-altacliente-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]
