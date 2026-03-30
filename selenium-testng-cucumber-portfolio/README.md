# Selenium + TestNG + Cucumber Portfolio Project

This is a small portfolio-ready UI automation framework built with **Java, Selenium WebDriver, TestNG and Cucumber**.

It automates a realistic login and cart flow on **SauceDemo** 
- BDD with Gherkin
- TestNG execution
- reusable driver setup
- assertions and reporting
- clean project structure for scaling

## Demo scenarios
- Valid login
- Invalid login
- Add item to cart and verify cart badge
- Remove item from cart and verify it disappears

## Tech stack
- Java 17
- Selenium WebDriver
- TestNG
- Cucumber JVM
- Maven

## Project structure
```
src
├── test
│   ├── java
│   │   └── com/zain/portfolio
│   │       ├── core
│   │       ├── hooks
│   │       ├── pages
│   │       ├── runners
│   │       ├── stepdefinitions
│   │       └── utils
│   └── resources
│       ├── config
│       └── features
```

