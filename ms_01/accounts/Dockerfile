# Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# Information about who maintains the image
#MAINTAINER maheshwarghane147@gmail.com
LABEL "org.opencontainers.image.authors"="maheshwarghane147@gmail.com"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]