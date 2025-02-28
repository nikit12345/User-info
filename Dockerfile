
FROM openjdk:17-alpine
EXPOSE 9094

WORKDIR	/opt
COPY target/*jar /opt/restorantlisting.jar
ENTRYPOINT exec java $JAVA_OPTS -jar restorantlisting.jar


