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
  
-----------------------------------------------------------------------------------------------------------------------------

To use this jenkins file edit the envirment variables as required and get required credentials added to the jenkins credentials manager.
Please look below for the jenkins setup I have done to test the jenkinsfile.
  
Jenkins Setup:
# Agent:
- I have used a Jenkins agent configured in jenkins nodes to execute this build.
- This Jenkins agent is a Docker agent which was configured to run on a t2-micro instance which has docker running.  
- This Jenkin Docker slave image I have used was having GIT, MAVEN, JDK, Docker and AWS CLI installed.
- I have place the Dockerflie in this repository under jenkins_slave folder which is used to build this docker image.
# Credentials :
- Following credentials were added to the jenkins credentials manager:
    - ssh credentials to Docker_slave_agent
    - Login credentials to the git hub
    - AWS credentials
