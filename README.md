# Maven-Project-Hybrid-Framework

#Running my project in Jenkins

Started by user sugayathri
Running as SYSTEM
Building in workspace C:\Program Files (x86)\Jenkins\workspace\INetBanking
[INetBanking] $ cmd /c call C:\WINDOWS\TEMP\jenkins5995902048061243375.bat

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
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 38898
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 4:16:09 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (TestCase1.java:16)- URL is opened
 INFO [main] (TestCase1.java:20)- entered username
 INFO [main] (TestCase1.java:22)- entered password
 INFO [main] (TestCase1.java:24)- successfully submitted
 INFO [main] (TestCase1.java:29)- Login test passed
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 4874
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 4:16:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 INFO [main] (TestCase2.java:37)- Login passed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 12179
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 4:18:16 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (AddCustomerTest3.java:18)- username is provided
 INFO [main] (AddCustomerTest3.java:20)- password is entered
 INFO [main] (AddCustomerTest3.java:22)- submitted successfully
 INFO [main] (AddCustomerTest3.java:26)- providing customer details....
 INFO [main] (AddCustomerTest3.java:42)- validation started...
 INFO [main] (AddCustomerTest3.java:47)- test case passed....
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 260.33 sec - in TestSuite

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ INetBanking ---
[INFO] Building jar: C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\INetBanking-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ INetBanking ---
[INFO] Installing C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\INetBanking-0.0.1-SNAPSHOT.jar to C:\WINDOWS\system32\config\systemprofile\.m2\repository\MavenProject\INetBanking\0.0.1-SNAPSHOT\INetBanking-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\pom.xml to C:\WINDOWS\system32\config\systemprofile\.m2\repository\MavenProject\INetBanking\0.0.1-SNAPSHOT\INetBanking-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  05:40 min
[INFO] Finished at: 2020-07-09T16:19:37+05:30
[INFO] ------------------------------------------------------------------------
Finished: SUCCESS

#Running INetbanking using MavenProject by adding plugins
#manage Jenkins and add maven plugins
#manage Jenkins->Global tool configuration->Add JDk path as in Your system and Maven-Installations add Maven path as in your system


Started by user sugayathri
Running as SYSTEM
Building in workspace C:\Program Files (x86)\Jenkins\workspace\INetBanking-MavenProject
Parsing POMs
Discovered a new module MavenProject:INetBanking INetBanking
Modules changed, recalculating dependency graph
Established TCP socket on 50833
[INetBanking] $ "C:\Program Files\Java\jdk1.8.0_251\/bin/java" -cp "C:\Program Files (x86)\Jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-agent-1.13.jar;C:\apache-maven-3.6.3\boot\plexus-classworlds-2.6.0.jar;C:\apache-maven-3.6.3/conf/logging" jenkins.maven3.agent.Maven35Main C:\apache-maven-3.6.3 "C:\Program Files (x86)\Jenkins\war\WEB-INF\lib\remoting-4.2.1.jar" "C:\Program Files (x86)\Jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-interceptor-1.13.jar" "C:\Program Files (x86)\Jenkins\plugins\maven-plugin\WEB-INF\lib\maven3-interceptor-commons-1.13.jar" 50833
<===[JENKINS REMOTING CAPACITY]===>channel started
Executing Maven:  -B -f C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\pom.xml clean install
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
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 28091
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 5:17:39 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (TestCase1.java:16)- URL is opened
 INFO [main] (TestCase1.java:20)- entered username
 INFO [main] (TestCase1.java:22)- entered password
 INFO [main] (TestCase1.java:24)- successfully submitted
 INFO [main] (TestCase1.java:29)- Login test passed
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 1882
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 5:17:57 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 INFO [main] (TestCase2.java:37)- Login passed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
 INFO [main] (TestCase2.java:20)- user name provided
 INFO [main] (TestCase2.java:22)- password provided
 WARN [main] (TestCase2.java:32)- Login failed
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 32206
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 09, 2020 5:19:39 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Privacy error
https://demo.guru99.com/v4/index.php
 INFO [main] (AddCustomerTest3.java:18)- username is provided
 INFO [main] (AddCustomerTest3.java:20)- password is entered
 INFO [main] (AddCustomerTest3.java:22)- submitted successfully
 INFO [main] (AddCustomerTest3.java:26)- providing customer details....
 INFO [main] (AddCustomerTest3.java:42)- validation started...
 INFO [main] (AddCustomerTest3.java:47)- test case passed....
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 215.686 sec - in TestSuite

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

[JENKINS] Recording test results
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ INetBanking ---
[INFO] Building jar: C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\INetBanking-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ INetBanking ---
[INFO] Installing C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\INetBanking-0.0.1-SNAPSHOT.jar to C:\WINDOWS\system32\config\systemprofile\.m2\repository\MavenProject\INetBanking\0.0.1-SNAPSHOT\INetBanking-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\pom.xml to C:\WINDOWS\system32\config\systemprofile\.m2\repository\MavenProject\INetBanking\0.0.1-SNAPSHOT\INetBanking-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:29 min
[INFO] Finished at: 2020-07-09T17:20:58+05:30
[INFO] ------------------------------------------------------------------------
Waiting for Jenkins to finish collecting data
[JENKINS] Archiving C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\pom.xml to MavenProject/INetBanking/0.0.1-SNAPSHOT/INetBanking-0.0.1-SNAPSHOT.pom
[JENKINS] Archiving C:\Users\Rakesh\Desktop\seleniumwebdriver\work1\INetBanking\target\INetBanking-0.0.1-SNAPSHOT.jar to MavenProject/INetBanking/0.0.1-SNAPSHOT/INetBanking-0.0.1-SNAPSHOT.jar
channel stopped
Finished: SUCCESS
