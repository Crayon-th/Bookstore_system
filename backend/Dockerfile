FROM openjdk:18.0.1.1
ARG JAR_FILE=target/backend-1.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]