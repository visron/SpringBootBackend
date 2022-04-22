# SpringBootBackend
Sample project used to learn spring boot for backend development
## Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/gradle-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


 
## Technologies
* Java 11
* [Gradle](https://gradle.org/) for dependency management and build control
* [Spring Boot](https://spring.io/projects/spring-boot) - a traditional Spring web application
  that runs 24/7
    * [Spring Data JPA](https://spring.io/projects/spring-data-jpa) is used as higher level layer
      of repository
    * JPA as ORM(with [Hibernate](https://hibernate.org/) implementation)


### Run through docker
If you want to develop locally, you need to run a local Mysql instance.
First pull version 5.7 image of Mysql

> docker pull mysql/mysql-server:5.7

Then start the container

> docker run -p 127.0.0.1:3306:3306  --name springtest -e MYSQL_ROOT_PASSWORD={mysql password} -d mysql/mysql-server:5.7

Now the container is running; you need to login once to create the database;

> docker exec -it springtest bash

This logs you in onto the container, but not yet into Mysql. You need the following command for that:

> mysql -p
> 
This starts up Mysql with prompting for a password;
use the Mysql password. 
Now you are logged in the database server, and you only have to create the springtest database; 
use the following SQL statement

> CREATE DATABASE SPRINGTEST;

Next, you have to grant external connection access (Mysql blocks this by default);

> CREATE USER 'root'@'%' IDENTIFIED BY '{MYSQL PASSWORD}';
> 
> GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
> 
> FLUSH PRIVILEGES;


Now you can start the springBootBackend app; the app will connect to the Mysql database, will query the database.

