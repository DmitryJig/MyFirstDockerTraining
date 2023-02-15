FROM openjdk:19
ADD /target/my_docker-0.0.1-SNAPSHOT.jar backend_my_docker.jar
ENTRYPOINT ["java", "-jar", "backend_my_docker.jar"]
