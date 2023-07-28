FROM openjdk:19
COPY target/sweSurveyJar.jar sweSurveyJar.jar
ENTRYPOINT ["java","-jar","/sweSurveyJar.jar"]
EXPOSE 8080 