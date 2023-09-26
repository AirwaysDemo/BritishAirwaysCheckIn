# Docker multi-stage build
FROM openjdk:17
ADD target/british-checkin.jar british-checkin.jar
ENTRYPOINT ["java","-jar","/british-checkin.jar"]

# Create a new user with UID 10014
RUN addgroup -g 10014 choreo && \
    adduser  --disabled-password  --no-create-home --uid 10014 --ingroup choreo choreouser

VOLUME /tmp

USER 10014