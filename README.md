# Anagram Checker – Cucumber + TestNG

## PROJECT CONFIGURATION

This project demonstrates a clean BDD-based test automation setup using Java, Maven, Cucumber, and JUnit 5.

### Technology Stack
- Java 21
- Maven
- Cucumber JVM
- TestNG 7
- HTML Reporting

---

## PROJECT STRUCTURE
```text
src
├── main
│   └── java
│       └── com.smbc.anagram
│           └── AnagramChecker.java
│
├── test
│   ├── java
│   │   └── com.smbc
│   │       ├── steps
│   │       │   └── AnagramSteps.java
│   │       └── runner
│   │           └── TestRunner.java
│   │
│   └── resources
│       ├── features
│       │   └── Anagram_Checker.feature
│       └── testng.xml
│
├── reports
│   └── index.html
│
└── pom.xml

```
---

## RUN OPTIONS

### Run from Command Line
```bash
mvn clean test

## Run from IntelliJ

- Right-click `TestRunner`
- Select **Run**
```
---

## Reporting

### Cucumber HTML Report

- Generated automatically during test execution
- Output location:

```text
reports/index.html
```
---
## Parallel Execution

Parallel execution is enabled using TestNG configuration and TestRunner files

### Configuration File Location

```text
src/test/resources/testng.xml
```
---
## Task Explanation

### Assignment 1: Anagram Checker

A reusable Java utility that determines whether two strings are anagrams.

- Ignores case
- Ignores spaces

### Assignment 2: BDD Automation

- Implemented using Cucumber feature files
- Scenario Outline used for multiple test cases
- Clean separation between business logic and test glue

---

## Notes

- No UI automation tool (Selenium) is used as the task is algorithmic.
- This demonstrates correct test design and avoids unnecessary browser automation.
- The project can be easily extended to UI or API layers if required.

