# :leaves: ioc-container-intro

Minimalist Java program using only Spring Inversion of Control container (spring-context) for study purposes, to better understand how 
dependency injection is setup and used on Spring framework.

The goal is to keep this as simple as possible and cover:

- [x] Application Configuration and Beans
- [ ] Beans scope
- [ ] Primary Beans and Beans Qualifiers
- [x] Components and ComponentScan
- [x] Setting up packages to be scanned by ComponentScan
- [ ] Options for dependency injection with Autowire
- [ ] Resource, properties ans profiles

Progress is going to be stored on different branches, starting from `1-one-bean`

This projects uses `maven` and Java 11.

To create the executable jar, run:

```shell script
mvn clean package
```

This will produce a bundle jar. To run the application:

```shell script
java -jar ioc-continer-intro-1.0-SNAPSHOT.jar
```
