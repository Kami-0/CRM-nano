FROM docker.nexign.com/openjdk/openjdk-11-rhel7

ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

EXPOSE 8090

WORKDIR /home

COPY target/composite-core-1.0-SNAPSHOT.jar /home/composite-core-1.0-SNAPSHOT.jar

ENTRYPOINT java -jar composite-core-1.0-SNAPSHOT.jar
