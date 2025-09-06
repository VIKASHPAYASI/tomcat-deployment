# tomcat-deployment

A complete Spring Boot web application packaged as a **WAR** for deployment on an external Apache Tomcat server.

---

## 📚 Table of Contents
- [Project Overview](#project-overview)
- [Project Structure](#project-structure)
- [Key Files Explained](#key-files-explained)
- [Setup & Build Instructions](#setup-build-instructions)
- [Deploying to Tomcat](#deploying-to-tomcat)
- [Application Features](#application-features)
- [Navigation Guide](#navigation-guide)
- [Troubleshooting](#troubleshooting)
- [FAQ](#faq)
- [License](#license)

---

## 🚀 Project Overview
This project demonstrates how to build a modern Spring Boot web application, package it as a WAR file, and deploy it to an external Tomcat server. It includes:
- User showcase page with dynamic data
- Modern, responsive HTML templates (Home, About, Users)
- Clean code structure with controllers, services, and models
- Maven build configuration for WAR packaging

---

## 📁 Project Structure
```
src/
  main/
    java/
      com/example/tomcat_deployment/
        TomcatDeploymentApplication.java      # Main entry point
        ServletInitializer.java               # Enables WAR deployment
        controllers/
          PageController.java                 # Serves home/about pages
          UserController.java                 # Serves users page
        service/
          UserService.java                    # Provides user data
        models/
          User.java                           # User data model
    resources/
      templates/
        home.html                             # Home page
        about.html                            # About page
        users.html                            # User showcase
      application.properties                  # App config
pom.xml                                       # Maven build config
README.md                                     # This file
```

---

## 🗂️ Key Files Explained
- **TomcatDeploymentApplication.java**: Starts the Spring Boot app and embedded Tomcat.
- **ServletInitializer.java**: Required for WAR deployment; configures the app for external Tomcat.
- **User.java**: Represents a user (id, name).
- **UserService.java**: Provides user data (currently hardcoded).
- **UserController.java**: Handles `/users` route, passes user data to users.html.
- **PageController.java**: Handles `/`, `/home`, `/about` routes, serves HTML pages.
- **home.html**: Welcome page with navigation.
- **about.html**: Info page about the app.
- **users.html**: Stylish user showcase page.
- **pom.xml**: Maven config for dependencies, WAR packaging, and plugins.

---

## 🛠️ Setup & Build Instructions
1. **Clone the repository**
   ```
   git clone <your-repo-url>
   cd tomcat-deployment
   ```
2. **Ensure Java 17+ and Maven are installed**
3. **Build the WAR file**
   ```
   mvn clean package
   ```
   The WAR file will be generated in the `target/` directory.

---

## 🏗️ Deploying to Tomcat
1. **Install Tomcat**  
   Download and extract [Apache Tomcat](https://tomcat.apache.org/) (tested with Tomcat 10).
2. **Copy the WAR file**  
   Move `target/tomcat-deployment.war` to Tomcat’s `webapps/` folder.
3. **Start Tomcat**
   - On Windows:  
     ```
     <tomcat-folder>/bin/startup.bat
     ```
   - On Linux/Mac:  
     ```
     <tomcat-folder>/bin/startup.sh
     ```
4. **Access the app**  
   Open [http://localhost:8080/tomcat-deployment/](http://localhost:8080/tomcat-deployment/) in your browser.

---

## ✨ Application Features
- **Home Page**: Modern welcome page with navigation buttons.
- **About Page**: Info about the app and its purpose.
- **Users Page**: Stylish card layout showing user data (id, name, initial).
- **Responsive Design**: Works well on desktop and mobile.
- **Spring Boot + Thymeleaf**: Dynamic HTML rendering.

---

## 🧭 Navigation Guide
- **Home**: `/` or `/home`
- **About**: `/about`
- **Users**: `/users` (shows user cards)

Use the navigation buttons on each page to move between sections.

---

## 🛠️ Troubleshooting
- **App not showing in Tomcat?**  
  - Check that the WAR file is in the `webapps/` folder.
  - Ensure Tomcat is running and listening on port 8080.
  - Review Tomcat logs for errors.
- **Build errors?**  
  - Make sure you have Java 17+ and Maven installed.
  - Run `mvn clean package` from the project root.

---

## ❓ FAQ
**Q: Can I use a database for users?**  
A: Yes! Replace the hardcoded list in `UserService.java` with database logic.

**Q: How do I change the context path?**  
A: Rename the WAR file or set the context in Tomcat’s `server.xml`.

**Q: Can I run this as a JAR?**  
A: Yes, but this guide is for WAR deployment to external Tomcat.

---

## 📄 License
This project is open source. See [LICENSE](LICENSE) for details.

---

**Ready to deploy your Spring Boot app to Tomcat? Follow the steps above and enjoy your modern web application!**