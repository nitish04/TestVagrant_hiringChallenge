**Tools/Software requirement for windows machine :-**

1. IntelliJ IDEA (Community)
2. JDK 8.1 and Jre 1.8
3. Git

**To import project** 

1. Open intellij >Setup JDK path( if required) 
2. Click on import
3. select the project, click on ok >next> navigate to main window
4. click on 'add as a maven project'

**For Test case execution** 

- Suites> Open SeleniumSuite.xml
- Enable/disable the test cases for execution 
- for Enable/Disable the test case select the line "`ctrl + '/' `"
- right click on SeleniumSuite.xml, click on Run


**FrameWork Structure :-** 

**1. App_ApkFiles** - Contains the App Apk Files.   
**2. test-output** -Contains TestNg test reports.  
**3. Src**
  - **AppPages**            - Contains individual App page class
  - **ElementLocatorsRepo** - Contains all the path locators
  - **resources/Conf**      - Stores all the credentials 
  - **resources/Suite.xml** - TestNG suits for executing test cases
  - **test/testScript**     - Contains all the test scripts
  - **Util**                - Contains the Utility Classes  
**4. pom.xml** - Contains all the Maven Dependency.



