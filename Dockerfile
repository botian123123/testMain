FROM  openjdk:17-jdk-slim
LABEL app="cicdtest" version="0.0.1"
COPY ./demo/target/*SNAPSHOT.jar cicdtest.jar
CMD java -jar cicdtest.jar