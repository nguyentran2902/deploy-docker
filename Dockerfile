FROM openjdk:17
ADD target/deploy-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]



	