FROM amazoncorretto:17.0.7-alpine

EXPOSE 9090

ADD target/boot-docker-tcs.jar boot-docker-tcs.jar
ENTRYPOINT [ "java", "-jar", "/boot-docker-tcs.jar"]