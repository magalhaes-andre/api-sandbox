FROM openjdk:11.0.10-slim
WORKDIR /usr/src/reader/
COPY ./build/libs/reader-0.0.1-SNAPSHOT.jar ./
EXPOSE 8090
CMD ["java", "-jar", "reader-0.0.1-SNAPSHOT.jar"]