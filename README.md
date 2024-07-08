# Overview:

- This application is designed on core spring framework concepts. It doesn't have Spring boot auto
  configurations i.e., we'll have to configure everything ourselves starting from Dispatcher
  Servlet.
- This application is a Web application that doesn't have a 'MAIN' method.
- The packaging is 'WAR' not 'JAR' as 'JSP' pages do not work well with 'JAR'.
- The starting point for this web application is "index.jsp" page. However, to retrieve data from
  endpoints, we've to setup Dispatcher servlet. So Dispatcher Servlet becomes the starting point
  when it comes to Backend side of the application and 'index.jsp' for front end respectively.

````
NOTE: At the beginning of development, we're given only 'index.jsp' so technically it's the starting point for the application.
````

## How to create a Web-Application:

- We can create web-app using IntelliJ or Eclipse.
- In IntelliJ, select new project and choose maven
- Choose archetype as 'web-app' and we've a fresh web-app for us to work on.

## How to run the application:

- We need to download and install a local tomcat server on our machine.
- In Eclipse it's pretty straight forward. However, for IntelliJ it becomes a little tricky,

### Community:

- For community download 'Smart Tomcat' plugin from marketplace.

### Ultimate:

- We can choose from existing Tomcat configuration. Follow below screenshots for reference:

![1st Image](src/main/resources/screenshots/1%20-%20Select%20Edit%20Configuration.png)
![2nd Image](src/main/resources/screenshots/2-Run%20configuration.png)

- Now click on 'Add new'. Select Tomcat Local Server (NOT TomEE server pls).
- Select previously installed Tomcat server as Application server and change update and frame
  deactivation action as shown in SS below:

![3rd Image](src/main/resources/screenshots/3%20-%20Tomcat%20Server%20and%20Exploded%20Settings.png)

- In deployment section select an exploded war and choose empty Application context. By default,
  IntelliJ configures Application context with some value, if we do not change it then our
  application URL must begin after the value specified in Application context.

![4th Image](src/main/resources/screenshots/4%20-%20Deployment.png)

- Setting 'update' and 'frame deactivation action' as will let us test our changes as we develop
  rather than redeploying the app. These actions are automatically triggered. If not we can manually
  trigger using 'Ctrl + F10'.
    - NOTE: Minor changes are automatically detected like changing variable names or code changes
      withing a method.
- To Run the application, press 'Shift + F10'.

# Minor observations

- Run app using `Shift + F10`
- Adding new methods still needs restarting tomcat however for minor changes we can use `Ctrl + F10`
  to update the classes and sources
