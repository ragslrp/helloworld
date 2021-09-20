FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY /home/ubuntu/helloWorld-0.0.1.jar /opt/helloWorld-0.0.1.jar
ENTRYPOINT exec java $JAVA_OPTS -jar helloWorld-0.0.1.jar