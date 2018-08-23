FROM frekele/gradle:4.8-jdk8u172 as build
WORKDIR /srv

COPY . /srv
RUN cd /srv && gradle --no-daemon build

FROM openjdk:10.0.2-jre-slim

COPY --from=build /srv/build/libs/*.jar /srv/
ENTRYPOINT ["java", "-server", "-jar", "/srv/remote-dubugging-1.0-SNAPSHOT.jar"]
