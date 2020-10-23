# EclipseDynamicWebProject

This is a very simpe WebAPI project built in eclipse to quickyly get one started buiding their own api. Simply follow the steps below to customize to your project name. Go to the src.com.sample.project package and start coding. This sample was built using Eclipse with Maven. Basic example for GET and POST are provided.


1.  Open eclipse to a workspace

2.  File Import -> Git -> Projects from Git -> Clone URI

	a. Set Directory to workspace and specify *project name*
	
	b. Import as general project
	
3.  Right Click the *project name* in the Project Explorer, 

	select **Configure -> Convert to Maven Project**

4.  Edit **pom.xml** with *project name*

5.  Edit **web.xml** display name with *project name*

6.  Right Click the *project name* in the Project Explorer, 
	
	select **Maven -> Update project**

7.  Right Click the *project name* in the Project Explorer,
	
	select **Run as -> Maven build...  set goals: clean install**

8.  In eclipse, configure tomcat server and start server

9.  Test app: http://localhost:8080/*project name*/status

     Example: http://localhost:8080/RestAPI/status

Keywords:  Rest API, Eclipse Dynamic Web App, Web API
