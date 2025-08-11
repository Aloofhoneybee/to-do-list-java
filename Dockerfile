FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the JAR from Maven target folder to the container
COPY target/*.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
