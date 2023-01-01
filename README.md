# SpringBootProfiles_DB

**SpringBootProfiles**
In this project, we are using different profiles in spring boot application

In this demo application, we will see how to configure different databases at runtime based on the specific environment by their respective profiles.

As the DB connection is better to be kept in a property file, it remains external to an application and can be changed. We will do so here. But, Spring Boot — by default — provides just one property file ( application.properties). So, how will we segregate the properties based on the environment?

The solution would be to create more property files and add the "profile" name as the suffix and configure Spring Boot to pick the appropriate properties based on the profile.

Then, we need to create three application.properties:

application-dev.properties
application-test.properties
application-prod.properties
Of course, the application.properties will remain as a master properties file, but if we override any key in the profile-specific file, the latter will gain precedence.

I will now define DB configuration properties for in respective properties file and add code in DBConfiguration.class to pick the appropriate settings.
