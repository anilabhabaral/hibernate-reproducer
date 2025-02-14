### Hibernate test app

- Maven & Java version:
```
$ mvn -v           
Apache Maven 3.9.6 (bc0240f3c744dd6b6ec2920b3cd08dcc295161ae)
Maven home: /Users/abaral/Documents/apache-maven-3.9.6
Java version: 11.0.24, vendor: Eclipse Adoptium, runtime: /Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
Default locale: en_IN, platform encoding: UTF-8
OS name: "mac os x", version: "15.1.1", arch: "aarch64", family: "mac"
```
- Build the application:
```
$ cd apph

$ mvn clean install
```
- Start the JBoss EAP 7.4
```
.$JBOSS_HOME/bin/standalone.sh
```
- Deploy the app using cli:
```
deploy /path/to/apph1.war
```
- Access the app:
```
curl http://127.0.0.1:8080/apph1/test
```
