#!/bin/sh
echo starting mvn clean
mvn clean
echo done cleaning
echo starting mvn build
mvn package -DskipTests
echo build successful start docker compose with rebuild
docker-compose up --build

