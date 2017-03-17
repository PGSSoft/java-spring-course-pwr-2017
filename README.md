# Java Spring PWR 2017 Course Page
# Intro
This is the homepage of Java/Spring course organized on Wrocław Uniwersity of Technology by [PGS Software](https://www.pgs-soft.com/) in Spring 2017.

Our goal is to go through key aspects of professional development of web application based on the most popular Java web framework - [Spring]( https://spring.io/).

After the course, we would like to invite some of you to participate in summer internship program at PGS Software. Do not worry, its paid internship, and you will be able to put your newly acquired knowledge in practice in real-world challenges in renowned software house. Perhaps later you would like to stay with us longer…

# Announcement

Any important news, like exam results, goes here. 

# Homework

## Chapter 4

Fill the questionaire for chapter 4 in agenda

Add to an existing application endpoints that will:
* Accept GET request with source currency and target currency and return exchange rates based on real data from http://fixer.io/
* Accept GET request with source currency and multiple target currencies and return rates for each one
* Do the same, but accept POST request with a JSON body containing those parameters
* Accept a number between 0 and 1000, source currency and target currency and performs conversion
* Add date as parameter to present historical results
* Return some status codes besides "200 OK" and "500 Internal Server Error"

Resources:

* How to build own webervice: https://howtotrainyourjava.com/2017/03/09/spring-web-basics/
* How to use external webservice: https://spring.io/guides/gs/consuming-rest/


## Chapter 3
`Please also fill in the questionaire attached to description of chapter 3. Fron now on the questionaire will be attached to each chapter`

Split existing application into several maven modules with following naming and content:
- rest client - contains the `DemoApplication` along with controllers
- business logic interface - contains technology agnostic interfaces
- business logic implementation - contains classes implementing interfaces
- rest client - leave empty for now
- database - leave empty for now

You may have use of following resources

- guide to modules: http://books.sonatype.com/mvnex-book/reference/multimodule.html
- guide to configuration: http://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch03.html
- some basics of Spring core: https://howtotrainyourjava.com/2017/02/23/spring-core-basics/

## Chapter 2

* Prepare a release using maven release plugin (http://maven.apache.org/maven-release/maven-release-plugin/) As a result the artefact should be deployed to local instance of nexus (download version 2 from https://www.sonatype.com/download-oss-sonatype) and tagged properly on your github repository

* Try the difference between @RestController and @Controller, add new method that will return CurrencyDTO that includes Currency and BigDecimal objects.

# Organization
* The course will start March 7 (Tuesday)
* The course will consist of eight meetings, carried over six weeks:
* 07.03.2017
* 09.03.2017
* 14.03.2017
* 16.03.2017
* 21.03.2017
* 28.03.2017
* 04.04.2017
* 11.04.2017
* Classes will start at 5pm and last two hours. 
* Classes will take place at Wrocław University of Technology, plac Grunwaldzki 11, 50-377 Wrocław, building D-21, room 201
* You can contact us via pgscourse@pgs-soft.com
* At the last class, there will be written exam, mandatory to pass the course.

# Prerequisites
* Basic Java SE skills is the only hard requirement. We would like to focus on how to implement features in given framework, environment, tools, clean code, good practices etc. not the basics of language itself.
* The lecture / workshop will be in Polish
* Written materials will be mostly in English

# Agenda
Note, that this may be subject to change depending on how fast we will be able to go. 

## Chapter 1: Introduction
* Intro, rules and organizational stuff. 
* An overview of the application we will build during the course.

## Chapter 2: Tools and environments
* IDE: Eclipse / Intellij IDEA.
* Version control: [GIT]( https://git-scm.com/), [GitHub](https://github.com/).
* Build tool: [Maven](https://maven.apache.org/).
* Deployment: [Tomcat](http://tomcat.apache.org/), [Heroku](https://www.heroku.com/).
* Code enhancement: [Project Lombok](https://projectlombok.org/index.html)

## Chapter 3: Spring basics
* Basics of HTTP, request, response, servlets
* Basics of Java web applications.
* Application configuration.
* [Spring Boot]( https://projects.spring.io/spring-boot/).
* Beans, scopes, annotations, factories, contexts.

https://docs.google.com/forms/d/1Enr7B2JxDPIqGDwOajTreTCIimgbtshanfD457UbMKM

## Chapter 4: Web Services
* HTTP methods, Servlets, JSON
* Web services, REST
* Processing incoming requests
* Outgoing requests - RestTemplate
* Tools – [Postman]( https://www.getpostman.com/docs/introduction).

https://docs.google.com/forms/d/1OkYfO5MBPqwf3KQmKElG3koCXyxRdYuywJ1FrioBAPw

## Chapter 5: Database
* SQL and relational databases.
* JPA, Object-Relational Mapping.
* Spring Data.

## Chapter 6: Testing
* Testing basics
* [Junit]( http://junit.org/), unit tests
* [Mockito]( http://site.mockito.org/), mocking frameworks
* Integration tests

## Chapter 7: Security & Logging
* Spring Security
* Logging frameworks

## Chapter 8: Error Handling & Advanced Spring
* HTTP Error codes and Java exceptions
* Advanced Spring features and more
* Written exam

# Materials
Aside from links in the agenda:
* [Spring - guides](https://spring.io/guides)
* [Spring framework Reference Documentation](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)
* [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* [How To Train Your Java articles on / near Spring](https://howtotrainyourjava.com/category/spring/)
* Varanasi Balaji, Belida Sudha: [Spring REST](http://www.apress.com/la/book/9781484208243)
* Sam Newman: [Building Microservices]( http://shop.oreilly.com/product/0636920033158.do)
* Craig Walls: [Spring in action](https://www.manning.com/books/spring-in-action-fourth-edition)

Pluralsight has some good courses. It is paid service, but there is a 30 days free trial:
* [Spring Fundamentals](https://app.pluralsight.com/library/courses/spring-fundamentals/table-of-contents)
* [REST Fundamentals](https://app.pluralsight.com/library/courses/rest-fundamentals/table-of-contents)
* [Architecting Web Applications with Spring](https://app.pluralsight.com/library/courses/architecting-web-applications-spring/table-of-contents)
* [Getting Started with Spring Data JPA](https://app.pluralsight.com/library/courses/spring-data-jpa-getting-started/table-of-contents)
* [Maven Fundamentals](https://app.pluralsight.com/library/courses/maven-fundamentals/table-of-contents)
* [Unit Testing In Java With JUnit](https://app.pluralsight.com/library/courses/java-unit-testing-junit/table-of-contents)

# Project setup

Environment preparation from ground up.

## GitHub

* Create an account on GitHub if you don’t yet have one: https://github.com/

## Git client / Cloning Repository

* Download SourceTree (recommended) from https://www.sourcetreeapp.com/ or command line client from https://git-scm.com/downloads
* Install
* Clone / new -> source path: https://github.com/Gvaireth/java-spring-course-pwr-2017.git
Or “git clone https://github.com/Gvaireth/java-spring-course-pwr-2017.git [source folder name]”
* More info on git: https://git-scm.com/doc

## MySQL (for Windows)

* Download MySQL Installer from https://dev.mysql.com/downloads/installer/
* Run
* [License Agreement]: Accept, Next
* [Setup Type]: choose “Developer Default”, Next
* [Path]: Next
* [Requirements]: Next
* [Installation]: Execute, Next
* [Product Configuration]: Next
* [Type and Networking]: use default settings, Next
* [Account and Roles]: choose root password, Next
* [Windows Service]: choose default settings, Next
* [Plugins and Extensions]: Next
* [Apply Server Configuration]: Execute
* [Product Configuration]: Next
* [Connect To Server]: Check, Next
* [Apply Server Configuration]: Execute, Finish
* [Product Configuration]: Next
* [Installation Complete]: Finish

## MySQL Workbench (for Windows)

* Download MySQL Workbench from: https://dev.mysql.com/downloads/workbench/
* Run
* Press “Download Prerequisites” if needed, it will open download page for:
Microsoft .NET Framework 4.5 (offline installer at: https://www.microsoft.com/en-us/download/details.aspx?id=42642)
Visual C++ Redistributable for Visual Studio 2015
* Install one or both, restart MySQL Workbench Installer
* Next, Next
* [Setup Type]: choose “Complete”, Next, 
* Install, Finish
* [Welcome to MySQL Workbench]: Local Instance MySQL57, Connect

## Java JDK

* Download Java SE Development Kit 8u121 from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Accept License Agreements
* Run, Next, Next
* Set JAVA_HOME, example for Windows: https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html

## Eclipse / Intellij IDEA

* Download Eclipse IDE for Java EE Developers  from https://www.eclipse.org/downloads/eclipse-packages/
* Choose 64 bit version if you installed 64 bit version of JDK
* Install

## Lombok

* Download lombok.jar from https://projectlombok.org/download.html
* Run jar (using “Java (TE) Platform SE Binary” on Windows)
* If it says it can’t find any IDE on your computer, specify eclipse.exe location -> Install / Update
* It should add -javaagent:lombok.jar to -vmargs in eclipse.ini and lombok.jar file in Eclipse root folder
* Restart Eclipse if it’s running

## Project Setup
### In Eclipse:
* File -> Import -> Maven-> Existing Maven Projects -> Next
* Select WeatherForecast as root directory. You should have root pom.xml file displayed and submodules pom.xml underneath. -> Finish.
* Wait for Importing Maven projects background job to finish
* Go to Workbench (upper right corner)
* If there will be Java problems don’t panic
* Window -> preferences -> Java -> Installed JREs -> Add -> Standard VM -> Directory for Java JDK (not JRE!) -> Finish. Choose jdk from list -> Apply.
* Root project (WeatherForecast) -> Run as Maven Install, it should output “[INFO] BUILD SUCCESS” at the end
* If there are still red markers: Project -> Clean
* Go to com.pgs.ws.rest.Application.java class in rest module, Run as -> Java Application
* Output should start to appear on console, and at the end, you should get a line like:  “ : Started Application in 12.208 seconds (JVM running for 12.852)”

### In MySQL Workbench (setup for chapter 5: Database)
* MySQL Connections -> Local instance MySQL57
* File -> New query tab
* Create schema by executing statement: “CREATE DATABASE forecast DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;”
* Schema name should match property: “spring.datasource.url”  in project file: “WeatherForecast\database-access\src\main\resources\application.properties”, in this case “jdbc:mysql://localhost:3306/forecast”
* Create user by executing statement: “CREATE USER 'username'@'localhost' IDENTIFIED BY userpass;”
* User name and password should match properties “spring.datasource.username” and “spring.datasource.password” in the same file
* Grant the new user permissions to schema: “GRANT ALL ON forecast.* TO 'username'@'localhost';”
* Click refresh in Schemas and select forecast if it’s not visible yet
* File -> Run SQL script, select script from project: “WeatherForecast\database-access\src\main\resources\sql\mysql\ddl\V0__create_forecast_table.sql”, select forecast schema -> Run

## Curl

* Download curl from https://curl.haxx.se/download.html
* From command line: curl -H "Content-type: application/json" http://localhost:8080/forecast/Berlin/
* It should output something like: {"location":"Berlin","temperature":278}

## Postman

* Postman might be more convenient alternative to curl, download and install from https://www.getpostman.com/docs/introduction (requires Google Chrome browser)
* In New tab -> Enrer request URL: “http://localhost:8080/forecast/Berlin/2016-03-03/” 
* In headers select “Content-type” key and “application/json”
* Hit send, and you should get the same output as in Curl

