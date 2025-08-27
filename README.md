# tomcat-deployment

A Spring Boot Maven Java project demonstrating how to deploy a Spring Boot application as a **WAR** file to an **external Apache Tomcat** server.

---

## 🚀 Overview

Deploying a Spring Boot application to an external Tomcat involves:

1. Configuring the Spring Boot project for WAR packaging  
2. Building the WAR file using Maven  
3. Deploying the WAR file to a standalone Tomcat server

---

## 📁 Project Setup

### 1. Prepare the Spring Boot Project for WAR Deployment

#### 🔧 Change Packaging Type

Update your `pom.xml` to use `war` packaging:

```xml
<!-- pom.xml -->
<packaging>war</packaging>
```


#### 🚫 Exclude Embedded Tomcat
Prevent conflicts with the external server by excluding the embedded Tomcat and marking it as provided:

```xml
<!-- pom.xml -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
</dependency>
```

####🧠 Configure the Main Application Class
Ensure your main application class extends SpringBootServletInitializer and overrides the configure() method:

```java
// MainApplication.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}

```

### 2. Build the WAR File
Use Maven to package the application:

```
mvn clean package

```
The generated .war file will be located in the target/ directory.
	

### 3. Deploy the WAR File to External Tomcat

#### 📦 Install Tomcat

If not already installed, download and extract Apache Tomcat from the official website (I used tomcat 10 for this project.

#### 📁 Copy the WAR File
Copy the tomcat-deployment.war file from target/ into the webapps/ directory of your Tomcat installation.

#### ▶️ Start Tomcat
Start Tomcat using the appropriate script for your OS:
```
# Windows

apache-tomcat-10.1.44\bin>startup.bat 
```

#### 🌐 Access the Application
Once Tomcat starts successfully, the application will be deployed under the context path matching the WAR name:

```
http://localhost:8080/tomcat-deployment/
```

