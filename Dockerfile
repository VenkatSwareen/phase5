FROM openjdk:8
EXPOSE 8083
ADD target/docker-phase5.jar docker-phase5.jar
ENTRYPOINT ["java","-jar","docker-phase5.jar"]