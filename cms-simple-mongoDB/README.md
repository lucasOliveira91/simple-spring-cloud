# Spring Application

using:
1.MongoDB
2.WebFlux for reative implementation
3.profile "container" configured to create the application container.

Pay Attention: 
1. Swagger doesn't work with reative project until this date.
2. For to create the container execute  the follow command: mvn clean install docker:build
Case you want push your container to Docker HuB, chenge the docker id insede the pom.xml.
3. it is necessary to have a momgoDB, use de follow command to pull a container mongoDB: docker pull mongo:3.4.10
and create a network to attach with container: docker network create cms-application, aftet start the container
docker run -d --name mongodb --net cms-application -p 27017:27017 mongo:3.4.10


 
