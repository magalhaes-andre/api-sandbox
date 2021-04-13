FROM openjdk:11.0.10-slim
WORKDIR /usr/src/writer/
COPY ./build/libs/writer-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
CMD ["java", "-jar", "writer-0.0.1-SNAPSHOT.jar"]