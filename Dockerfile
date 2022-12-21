FROM openjdk:8
EXPOSE 8080
ADD target/docker-spring.jar docker-spring.jar
ENTRYPOINT ["java","-jar",-spring.jar"]