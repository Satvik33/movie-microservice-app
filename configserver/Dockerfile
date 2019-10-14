FROM java:8-jre
ADD ./target/Spring-Config-Server-0.0.1-SNAPSHOT.jar /usr/src/Spring-Config-Server-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "Spring-Config-Server-0.0.1-SNAPSHOT.jar"]