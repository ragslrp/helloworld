FROM openjdk:8-alpine

# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/helloWorld-0.0.1.jar $PROJECT_HOME/helloWorld.jar

WORKDIR $PROJECT_HOME

CMD ["java" ,"-jar","./helloWorld.jar"]