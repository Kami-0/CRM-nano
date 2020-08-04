FROM docker.nexign.com/openjdk/openjdk-11-rhel7

ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

EXPOSE 8080

WORKDIR /home

COPY target/cam-core-1.0-SNAPSHOT.jar /home/cam-core-1.0-SNAPSHOT.jar

ENTRYPOINT java -jar cam-core-1.0-SNAPSHOT.jar
