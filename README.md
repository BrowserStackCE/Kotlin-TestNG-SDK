# KotlinTestNGSeleniumSDK
This repository demonstrates how to run Selenium tests in Kotlin Testng on BrowserStack Automate using BrowserStack SDK.

# kotlin-testng-browserstack

[TestNG](http://testng.org) Integration with BrowserStack.

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

## Using Maven
### Run sample build

1. Clone the repository

2. Set BrowserStack Credentials
   Save your BrowserStack credentials as environment variables for easier access and improved security.

macOS/Linux
```sh
export BROWSERSTACK_USERNAME="your_username"
export BROWSERSTACK_ACCESS_KEY="your_access_key"
```
Windows PowerShell
```sh
$env:BROWSERSTACK_USERNAME="your_username"
$env:BROWSERSTACK_ACCESS_KEY="your_access_key"
```
Windows CMD
```sh
set BROWSERSTACK_USERNAME=your_username
set BROWSERSTACK_ACCESS_KEY=your_access_key
```

3. Install BrowserStack SDK using Maven Archetype
   Use Maven Archetype to quickly scaffold SDK configuration in your project. It automatically adds browserstack-java-sdk in your pom.xml and creates a browserstack.yml config file.

macOS or Linux:

```sh
mvn archetype:generate -B -DarchetypeGroupId=com.browserstack \
-DarchetypeArtifactId=browserstack-sdk-archetype-integrate -DarchetypeVersion=1.0 \
-DgroupId=com.browserstack -DartifactId=browserstack-sdk-archetype-integrate -Dversion=1.0 \
-DBROWSERSTACK_USERNAME=your_username -DBROWSERSTACK_ACCESS_KEY=your_access_key \
-DBROWSERSTACK_FRAMEWORK=testng
```
Windows:
```sh
mvn archetype:generate -B -DarchetypeGroupId=com.browserstack ^
-DarchetypeArtifactId=browserstack-sdk-archetype-integrate -DarchetypeVersion=1.0 ^
-DgroupId=com.browserstack -DartifactId=browserstack-sdk-archetype-integrate -Dversion=1.0 ^
-DBROWSERSTACK_USERNAME=your_username -DBROWSERSTACK_ACCESS_KEY=your_access_key ^
-DBROWSERSTACK_FRAMEWORK=testng
```

- Install dependencies `mvn compile`
- To run the test suite having cross-platform with parallelization, run `mvn clean test -DsuiteXmlFile=testng.xml`

Understand how many parallel sessions you need by using our [Parallel Test Calculator](https://www.browserstack.com/automate/parallel-calculator?ref=github)

### Integrate your test suite

This repository uses the BrowserStack SDK to run tests on BrowserStack. Follow the steps below to install the SDK in your test suite and run tests on BrowserStack:

* Add maven dependency of browserstack-java-sdk in your pom.xml file
```sh
<dependency>
    <groupId>com.browserstack</groupId>
    <artifactId>browserstack-java-sdk</artifactId>
    <version>LATEST</version>
    <scope>compile</scope>
</dependency>
```


## Notes
* You can view your test results on the [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
