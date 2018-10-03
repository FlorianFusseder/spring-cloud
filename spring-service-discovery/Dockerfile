FROM adoptopenjdk/openjdk8:latest
VOLUME /tmp
RUN mkdir /opt/app
COPY target/spring-service-discovery.jar spring-eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/spring-eureka-server.jar"]