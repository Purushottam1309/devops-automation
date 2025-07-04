FROM openjdk:21
EXPOSE 8080
ADD target/DockerfileImage.jar DockerfileImage.jar
ENTRYPOINT ["java","-jar","/DockerfileImage.jar"]