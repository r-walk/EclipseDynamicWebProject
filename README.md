# EclipseDynamicWebProject

This is a very simple and straight forward Web RestAPI project built in eclipse to quickyly get one started coding for their own needs. Simply follow the steps below to customize to your project name. Go to the **com.sample.project** package and start coding in **WebResources.java**. Basic examples for GET and POST are provided. The steps below are using Eclipse 2020 and Maven is used to install and maintain the necessary dependencies. 


1.  Open eclipse to a workspace

2.  File Import -> Git -> Projects from Git -> Clone URI (use: https://github.com/r-walk/EclipseDynamicWebProject.git)

	a. Set Directory to workspace and specify **your** *projectName*
	
	b. Import as general project
	
3.  Right Click the *projectName* in the Project Explorer, 

	select **Configure -> Convert to Maven Project**

4.  Edit **pom.xml** with *projectName*

5.  Edit **WebContent/WEB-INF/web.xml** display name with *projectName*

6.  Right Click the *projectName* in the Project Explorer, 
	
	select **Maven -> Update project**

7.  Right Click the *projectName* in the Project Explorer,

	select **Run as -> Maven build...  set goals: clean install**

8.  Configure and start a server in the eclipse workspace or right click the *project name*, **Export->War** and launch from an external container

9.  Test app: http://localhost:8080/*projectName*/status

     Example: http://localhost:8080/RestAPI/status

Keywords:  Rest API, Eclipse Dynamic Web App, Web API, Sample Project
