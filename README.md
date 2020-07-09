# Maven-Project-Hybrid-Framework

#Running my project in Jenkins

Started by user sugayathri
Running as SYSTEM
Building in workspace C:\Program Files (x86)\Jenkins\workspace\INetBanking
[INetBanking] $ cmd /c call C:\WINDOWS\TEMP\jenkins4874245015915663878.bat

C:\Program Files (x86)\Jenkins\workspace\INetBanking>cd C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking 

C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking>run.bat

C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking>cd C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking 

C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking>mvn clean install 
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< MavenProject:INetBanking >----------------------
[INFO] Building INetBanking 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ INetBanking ---
[INFO] Deleting C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ INetBanking ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ INetBanking ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ INetBanking ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ INetBanking ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ INetBanking ---
[INFO] Surefire report directory: C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 10797
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 12:16:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
