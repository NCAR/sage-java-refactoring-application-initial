# SAGE Refactor Application

Please read these directions completely prior to starting any work.

## Goals

This programming exercise is meant to be used to gather understanding of your Java web application programming
abilities and processes.

We are looking for the following knowledge and/or competencies:
* Object-oriented programming analysis and design principles.
* Understanding of high cohesion and low coupling.
* Ability to identify bugs and/or poorly written code and to fix/refactor that code.
* Demonstration of Clean Code principles.
* Understanding and knowledge of the Spring, Spring Boot, and Java web application environment.
* Understanding of the Java development environment including: maven, IDEs, Tomcat, etc...
* Understanding and ability to apply well known layered architectural and design pattern principles.
* Creation and usage of unit tests.
* Understanding of the HTTP protocol and RESTful API principles.
* Ability to prioritize work.

## Prerequisites

* You must have a [GitHub](https://github.com/) account.  If you don't already have an account you may [register for one](https://github.com/signup).

## Instructions/Directions

1. Clone this repository to your local development environment.
2. Create a new **private** repository on your personal GitHub account.
3. Change the remote origin of the cloned repository to your newly create repository on Github.
~~~
$ git remote set-url origin https://git-repo/new-repository.git
~~~
4. Push to your remote repository on Github.
5. Review the given source code and other resources.
6. Add work items to the BACKLOG.md file.
7. Please spend approximately 2 to 4 hours working on this application.  You are free to work on this application as
long as you see fit, but we **strongly** recommend that you only work for 4 hours maximum.
8. Focus on fixing the existing code to the best of your knowledge, skills, and abilities.  Please do not
add any new functionality.
9. Work in a manner that is consistent with your typical work style.
10. Commit to your repository as you feel a section of work is done.  We would like to see your workflow if possible.
11. There is more work than can reasonably get done in 4 hours. Please use the BACKLOG.md file to record any work that
  needs to be completed but you were unable to get to.  Order that list in highest to lowest priority.
12. When done with all your work, please apply your full name to the ACKNOWLEDGEMENT-OF-WORK.md file and commit that file.
  This act implies that all the work completed is your own and was done without any direct personal assistance.
13. Push all your changes to your **private** repository on GitHub.  **DO NOT** create a pull request against our
repository.
14. Email us letting us know that you are done, and we will reply with further instructions.

## Deployment

* This is a Spring Boot application and should be run by running the DatasetApplication class.
* This will start the application in an embedded [Tomcat 9](https://tomcat.apache.org/tomcat-9.0-doc/index.html)
instance.

## Business Rules

* A Dataset must have a title.
* Title must be unique (case insensitive).
* A Dataset must have at least one Keyword.

## Tips and Encouragement

* Take some time to look through the source code prior to starting your work.
* It is recommended to use an IDE for this work. We recommend Intellij, Eclipse, or Visual Studio Code.
* A friendly reminder that this is a multithreaded environment.
* Unit tests are expected be written as well as other production level code.

## Acknowledgements

This application is inspired by https://github.com/bsnyder-hybris/java-refactoring-exercise.
