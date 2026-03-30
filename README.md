[![Selenium CI](https://github.com/Hira073/selenium-testng-cucumber/actions/workflows/ci.yml/badge.svg)](https://github.com/Hira073/selenium-testng-cucumber/actions/workflows/ci.yml)

# Selenium TestNG Cucumber Automation Framework

## Overview
This project is a UI automation framework built using Selenium WebDriver, TestNG and Cucumber. It demonstrates a clean automation structure with reusable components and practical end-to-end scenarios.

## CI/CD Integration
This project is integrated with GitHub Actions to automatically execute tests on every push and pull request. Test results are validated through Maven Surefire reports.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Cucumber
- Maven

## Framework Highlights
- Page Object Model
- Reusable utilities
- BDD-style feature files
- Scalable project structure
- Easy test execution using Maven

## Test Scenarios
- Valid login
- Invalid login
- Add product to cart
- Checkout flow validation

## How to Run
```bash
mvn clean test
