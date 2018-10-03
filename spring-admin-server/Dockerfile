FROM adoptopenjdk/openjdk10:latest
VOLUME /tmp
RUN mkdir /opt/app
COPY target/spring-admin-server.jar spring-admin-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/spring-admin-server.jar"]