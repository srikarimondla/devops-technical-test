# Introduction
This repository contains the Java source code for a basic web application which exposes a single endpoint on port 8080. We would like to deploy this application as a service on AWS Elastic Container Service.

# Brief
We would like you to create a Jenkinsfile (and any other necessary artefacts) that performs the following:
- Build the application using Maven
- Create a Docker image that runs the application and exposes port 8080. Please use Alpine Linux and Adoptium OpenJDK 11
- Deploy the image to an AWS ECR repository
- Anything else that you feel the job should be doing

# What we are looking for
- A repository containing all the necessary code and files to create a Jenkins job that meets the requirements above
- Clean and maintainable code
- The use of best practices
- An awareness of the needs and limitations of a regulated environment

# Getting started
- Fork this repo into your own GitHub account
- To build the application run ./mvnw clean package
- Put any assumptions, notes and instructions into your README.md.


Jenkins Dependencies:
# Agent:
- I have used a Docker agent is configured in jenkins. 
- This Docker agent was configured to run on a EC2 t2-micro instance which has docker running.
- The Docker slave image I used was having GIT, MAVEN, JDK, Docker and AWS CLI.
- The Docker file  



