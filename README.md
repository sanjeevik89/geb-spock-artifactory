# geb-and-spock-artifactory-automation
+ Groovy-based Geb and Spock automation. 
+ Please run automation tests responsibly. You may use the code provided in this repository only to learn Geb and Spock.
+ Latest Geb Manual is your best source for documentation : __[Latest Geb Manual](http://www.gebish.org/manual/current/)__
+ Licensed under __[the Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)__

## Running the tests

### Artifactory login and logout example:

__Note__: All paths relative to directory: artifactory-app-ui-automation

+ Update the src\test\resources\LoginFlowConfig.groovy file with the username / password. 

+ Go to the artifactory-app-ui-automation directory and run the automated spec from the command line:
  - cd artifactory-app-ui-automation
  - gradlew chromeTest -Denv=test

+ The above runs the artifactory automated tests in Chrome. Using the configuration i.e., url, username, password etc supplied under the "test" environment.

## Changing environments
+ You can change the environment (env) to use for e.g. to "prod" env, by changing the command-line to use __-Denv=prod__ 

## Changing to a different browser
+ To run the tests with a different browser replace the __chromeTest__ above with the following choices:

  - Firefox :
    * gradlew firefoxTest -Denv=test
  - Chrome Headless :
    * gradlew chromeHeadlessTest -Denv=test
