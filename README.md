# Spring Boot Template

This is the minimum settings for an SpringBoot application.

It supports only hello REST API. (http://localhost:8080/hello)

It supports the IntelliJ IDEA as code editor.

## Lombok setting
Please make sure annotation processing for lombok. The following is how to set it on the IntelliJ IDEA.
```
Preferences > Build, Execution, Deployment > Compiler > Annotation Processors
 [*] "Enable annotation processing"
```

## How to run
### IntelliJ IDEA
Choose the following ways
#### Option 1. 
Ctrl + Shift + R in the MySpringBootApplication class.

#### Option 2.
Click the green play button in the MySpringBootApplication class. 

### Command Line
```shell script
$ ./gradlew build
$ ./gradlew run
```
