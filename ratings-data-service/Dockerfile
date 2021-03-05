FROM openjdk:8
EXPOSE 8080
ADD target/ratings-data-service.jar ratings-data-service.jar
ENTRYPOINT ["java","-jar","/ratings-data-service.jar"]