FROM eclipse-temurin:22

WORKDIR /app

LABEL mentainer="lamine FATY"

COPY  target/Dockerisation-0.0.1-SNAPSHOT.jar /app/Dockerisation

ENTRYPOINT ["java","-jar", "Dockerisation"]