FROM adoptopenjdk/openjdk11:alpine-slim
EXPOSE 9003:8080
ADD /build/libs/sat-ja-0.0.1-SNAPSHOT.jar sat-ja-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "sat-ja-0.0.1-SNAPSHOT.jar"]