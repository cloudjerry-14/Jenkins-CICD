# Use an official Maven image as a base image
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY pom.xml .
COPY src ./src

# Build the application using Maven
RUN mvn clean package -DskipTests

# Create a new image with a smaller base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage into the container
COPY --from=build /app/target/jenkins-k8s-argo-0.0.1-SNAPSHOT.jar .

# Expose the port that your Spring Boot application runs on
EXPOSE 8081

# Define the command to run your application
CMD ["java", "-jar", "jenkins-k8s-argo-0.0.1-SNAPSHOT.jar"]
