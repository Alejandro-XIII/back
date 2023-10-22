# SSMU-API

[Spring Boot](http://projects.spring.io/spring-boot/) application [3.1.2](https://spring.io/blog/2023/07/20/spring-boot-3-1-2-available-now)

[![CI/CD Pipeline](https://github.com/Alejandro-XIII/back/actions/workflows/build.yml/badge.svg)](https://github.com/Alejandro-XIII/back/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Alejandro-XIII_back&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=Alejandro-XIII_back)

## Requisitos

Para construir y ejecutar la aplicación necesita:

- [JDK 20](https://jdk.java.net/20/)
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## Ejecutando la aplicación localmente

Hay varias formas de ejecutar una aplicación Spring Boot en su máquina local. Una forma es ejecutar el método `main` en la clase `co.udea.ssmu.api.SsmuApiApplication` desde su IDE.

Alternativamente, puedes usar el [Plugin de Spring Boot Maven](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) de esta manera:
```shell
mvn spring-boot:run
```

## Otros comandos

Si desea limpiar y compilar el proyecto use el siguiente comando:
```shell
mvn clean install
```

En el caso de que quiera correr el comando sin validar los test del aplicativo ejecute:
```shell
mvn clean install -DskipTests
```