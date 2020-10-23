# EclipseDynamicWebProject

This example was built using Eclipse with Maven, testing with Tomcat server

1.	Open eclipse to a workspace
2.	File Import -> Git -> Projects from Git -> Clone URI
    a.	Set Directory to workspace and specify project name
    b.	Import as general project
3.	Convert to Maven Project
4.	Edit POM.XML with project name
5.	Edit WEB.XML display name with project name
6.	Maven -> Update project
7.	Run as -> Maven build … -> goals: clean install
8.	Configure and start server
9.	Test app:  http://localhost:9100/RestAPI/status
