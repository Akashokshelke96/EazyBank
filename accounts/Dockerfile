#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER akashokshelke@gmail.com
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="akashokshelke@gmail.com"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]


#  List of commands to create a JAR and run the application
#  mvn clean install
#  mvn spring-boot:run
#Alternative way to run the jar
#  java -jar .\target\accounts-0.0.1-SNAPSHOT.jar

#To build the docker image:
#docker build -t akashokshelke/accounts:v1 .

#To get the docker image:
#docker images

#To inspect the docker image:
#docker inspect <image id>

#To run the docker image:
#docker run -p 8080:8080 akashokshelke/accounts:v1

#To list the docker containers:
#docker ps