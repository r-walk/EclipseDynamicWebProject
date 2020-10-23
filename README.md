# EclipseDynamicWebProject

This is a very simpe WebAPI project built in eclipse to quickyly get one started buiding their own api. Simply follow the steps below to customize to your project name. Go to the **com.sample.project** package and start coding in **WebResources.java**. Basic examples for GET and POST are provided. This sample was built using Eclipse 2020 and uses Maven to install the necessary dependencies. 


1.  Open eclipse to a workspace

2.  File Import -> Git -> Projects from Git -> Clone URI

	a. Set Directory to workspace and specify *projectName*
	
	b. Import as general project
	
3.  Right Click the *projectName* in the Project Explorer, 

	select **Configure -> Convert to Maven Project**

4.  Edit **pom.xml** with *projectName*

5.  Edit **web.xml** display name with *projectName*

6.  Right Click the *projectName* in the Project Explorer, 
	
	select **Maven -> Update project**

7.  Right Click the *projectName* in the Project Explorer,

	select **Run as -> Maven build...  set goals: clean install**

8.  Configure and start a server in the eclipse workspace or right click the *project name*, **Export->War** and launch from an external container

9.  Test app: http://localhost:8080/*projectName*/status

     Example: http://localhost:8080/RestAPI/status

Keywords:  Rest API, Eclipse Dynamic Web App, Web API, Sample Project
