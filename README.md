# Title

Please read these directions completely prior to starting.

## Goal

This programming exercise is going to be used to gather understanding on your java programming abilities.

We are looking for the following:
* Object-oriented programming analysis and design principles.
* Understanding of high cohesion and low coupling.
* Ability to identify bugs and/or poorly written code and to fix/refactor that code.
* Understanding of Clean Code principles.
* Understanding and knowledge of the Spring, Spring Boot, and Java web development environment.
* Understanding of the Java development environment including: maven, IDEs, etc...
* Understanding and ability to apply well known architectural and design pattern principles.
* Creation and usage of unit tests.
* Understanding of the HTTP protocol and RESTful api principles.
* Ability to prioritize work.

## Prerequisites

* You must have a [GitHub](https://github.com/) account.  If you don't already have an account you may [register for one](https://github.com/signup).

## Instructions/Directions

* Please clone this repository to your local development environment.
* Create a new **private** repository on your personal GitHub account.
* Change the remote origin of the cloned repository to your newly create repository on Github.
~~~
$ git remote set-url origin https://git-repo/new-repository.git
~~~
* Please spend approximately 2 to 4 hours working on this application.
* Please only focus on
* Work in a manner that is consistent with your typical work style.
* Commit to your repository as you feel a section of work is done.
* There is more work than you can reasonably get done in 4 hours, please use the BACKLOG.md file to record any work that
  needs to be completed but you were unable to get to.  Order that list in highest to lowest priority.
* When done with all your work, please apply your name to the ACKNOWLEDGEMENT-OF-WORK.md file and commit that file.
  This act implies that all the work completed is your own and was done without any direct personal assistance.
* Push all your changes to your **private** repository on GitHub.
* Email us letting us know that you are done and we will reply with further instructions.

## Deployment

* This is a Spring Boot application and should be run by the DatasetApplication class.  This will start the application
  in an embedded [Tomcat 9](https://tomcat.apache.org/tomcat-9.0-doc/index.html) instance.

## Business Rules

* A Dataset must have a title.
* Title must be unique (case insensitive).
* A Dataset must have at least one Keyword.

## Tips and Encouragement

* Take some time to look through the source code prior to starting your work.
* It is recommended using an IDE for this work, we recommend Intellij, Eclipse, or Visual Studio Code.
* A friendly reminder that this is a multithreaded environment.
* Unit test should be written as well as our normal production level code.

## Acknowledgements

This application is a close clone of https://github.com/bsnyder-hybris/java-refactoring-exercise.

