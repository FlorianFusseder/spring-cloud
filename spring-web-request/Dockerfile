FROM adoptopenjdk/openjdk10:latest
VOLUME /tmp
RUN mkdir /opt/app
COPY target/spring-web-request.jar spring-web-request.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/spring-web-request.jar"]