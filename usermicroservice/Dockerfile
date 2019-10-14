FROM java:8-jre
ADD ./target/testdemo-0.0.1-SNAPSHOT.jar /usr/src/testdemo-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "testdemo-0.0.1-SNAPSHOT.jar"]