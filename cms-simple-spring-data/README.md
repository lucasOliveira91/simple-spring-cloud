# Spring Application - Spring Data JPA

The Spring Data JPA provides an easy way to implement a data access layer using the
JPA specification from Java EE. Usually, these implementations had a lot of
boilerplate and repetitive code and it was hard to maintain the changes in the
database code.

The Spring Data JPA is trying to resolve these issues and provides a
comprehensible way to do that without boilerplate and repetitive code.

The JPA Specification was created by the JCP (Java Community
Process) to help developers to persist, access, and manage data
between Java classes and relational databases. There are some
vendors that implement this specification. The most famous
implementation is Hibernate, and by default, Spring Data JPA uses Hibernate as the JPA implementation.

## Pay Attention:

1. we need the postgreSQL use the follow command, case your OS is Ubuntu
- **sudo apt-get install pgadmin3 -y**

2. We will use the version 9.6.6 of Postgres and use the alpine tag because it is smaller
than other Postgres images
- **docker pull postgres:9.6.6-alpine**
Start the container with
 - **docker run -d --name postgres --net cms-application -p 5432:5432 -e POSTGRES_PASSWORD=cms@springfive postgres:9.6.6-alpine**
 * -e : This enables us to pass environment variables for a container. In this
case, we want to change the password value.
