FROM openjdk:11
COPY ./target/Spe_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Spe_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]