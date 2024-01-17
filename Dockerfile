FROM  openjdk:17-jre-slim
LABEL app="cicdtest" version="0.0.1"
COPY ./demo/target/demo-0.0.1-SNAPSHOT.jar cicdtest.jar
CMD java -jar cicdtest.jar