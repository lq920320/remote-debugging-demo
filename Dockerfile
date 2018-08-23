FROM gradle:4.9.0 as build

COPY . /srv
RUN cd /srv && gradle --no-daemon build

FROM openjdk:11-ea-27-slim

COPY --from=build /srv/build/libs/*.jar /srv/
ENTRYPOINT ["java", "-server", "-jar", "/srv/remote-dubugging-1.0-SNAPSHOT.jar"]
