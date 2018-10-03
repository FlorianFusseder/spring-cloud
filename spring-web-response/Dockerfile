FROM adoptopenjdk/openjdk10:latest
VOLUME /tmp
RUN mkdir /opt/app
COPY target/spring-web-response.jar spring-web-response.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/spring-web-response.jar"]