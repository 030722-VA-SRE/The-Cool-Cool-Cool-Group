FROM maven:3.6.3-openjdk-8 as builder
COPY ./src/ src/
COPY ./pom.xml pom.xml
RUN mvn clean package -Dmaven.test.skip -Pprod

FROM java:8 as runner
COPY --from=builder target/ninjas.jar ninjas.jar
ENTRYPOINT ["java", "-jar", "/ninjas.jar"]