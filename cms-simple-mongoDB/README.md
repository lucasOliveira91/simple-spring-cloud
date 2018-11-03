# Spring Application

## Using:
* MongoDB
* WebFlux for reative implementation
* profile "container" configured to create the application container.

## Pay Attention: 
1. Swagger doesn't work with reative project until this date.
2. For to create the container, execute the follow command: mvn clean install docker:build
Case you want push your container to Docker HuB, change the docker id inside the pom.xml.
3. it's necessary to have a momgoDB, use de follow command to pull a container mongoDB
- **docker pull mongo:3.4.10**
and create a network to attach with container 
- **docker network create cms-application**
After start the container
-* *docker run -d --name mongodb --net cms-application -p 27017:27017 mongo:3.4.10**
Case you want a tool to see mongo data, use the "mongo-express" with command: 
- **docker run -d --link mongodb:mongo --net cms-application -p 8081:8081 mongo-express**
end go to http://localhost:8081.

 
