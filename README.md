## Files to test web sites using Selenium webDriver library for Java

To execute these files follow the next steps:

---
1. Download Selenium-java.4.7.2.zip from "Selenium Clients and WebDriver Language Bindings" section of https://www.selenium.dev/downloads/
2. Download mozilla/geckodriver-v0.31.0-win64 from https://github.com/mozilla/geckodriver/releases
3. Unzip files downloaded in previous steps
4. Right click on left navigation bar over the project name > Properties > JavaBuildPath > Libraries > Add external JARs > Select all jar files located on selenium-java-4.7.2/ then Select all jar files located on selenium-java-4.7.2/lib/
5. Apply and Close 
6. Create a new directory in working directory called drivers
7. Copy the content of geckodriver folder in drivers/ 
8. Open java files using Eclipse > Right click > Run as Java application
---
* Install Selenium IDE add-ons on Firefox browser.
* In JS you can use mvn to use browser clients.

---
Requirements:

This repo is deployed using: 


-Eclipse IDE for Enterprise Java Developers (includes Incubating components)
- -Version: 2020-06 (4.16.0)
- -Build id: 20200615-1200 

-Java:
- -openjdk 11.0.2 2019-01-15
- -OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
- -OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)

-Firefox:
- -108.0.2 (64 bits)	
		