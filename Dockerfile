FROM openjdk:17
ADD target/british-checkin.jar british-checkin.jar
ENTRYPOINT ["java","-jar","/british-checkin.jar"]