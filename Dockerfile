FROM openjdk:11

ARG JAR_LOCATION=build/libs/tw-0.0.1-SNAPSHOT.jar

COPY ${JAR_LOCATION} tw.jar

ENTRYPOINT ["java", "-jar", "/tw.jar"]