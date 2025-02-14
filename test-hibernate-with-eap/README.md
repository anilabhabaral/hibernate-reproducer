### Hibernate test application(war) to deploy on top of EAP 8.x.

- Maven & Java version:
```
$ mvn -v
Apache Maven 3.9.6 (bc0240f3c744dd6b6ec2920b3cd08dcc295161ae)
Maven home: /Users/abaral/Documents/apache-maven-3.9.6
Java version: 17.0.12, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
Default locale: en_IN, platform encoding: UTF-8
OS name: "mac os x", version: "15.3", arch: "aarch64", family: "mac"
```
- Build the application:
```
$ cd apph

$ mvn clean install
```
- Start the JBoss EAP 
```
.$JBOSS_HOME/bin/standalone.sh
```
- Deploy the app using cli:
```
deploy /path/to/apph1.war
```
- Access the app:
```
curl http://127.0.0.1:8080/apph1/
```
