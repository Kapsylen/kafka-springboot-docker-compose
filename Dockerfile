# Use the official OpenJDK base image
FROM maven:3.8.3-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/app.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]