# Use Alpine Linux as the base image

FROM adoptopenjdk/openjdk11:alpine


# Set the JAVA_HOME environment variable

ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk

ENV PATH="$PATH:$JAVA_HOME/bin"


# Set the working directory

WORKDIR /app


# Copy the application JAR file

COPY target/application-1.0.0-SNAPSHOT.jar /app/application-1.0.0-SNAPSHOT.jar


# Expose port 8080

EXPOSE 8080


# Run the application

CMD ["java", "-jar", "/app/application-1.0.0-SNAPSHOT.jar"]
