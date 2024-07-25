#FROM openjdk:17
#EXPOSE 9090
#ADD target/e-commerce.jar e-commerce.jar
#ENTRYPOINT ["java","-jar","/e-commerce.jar"]

#FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ./target/e-commerce.jar e-commerce.jar
#ENTRYPOINT ["java","-jar","/e-commerce.jar"]
