# Daily Finance Selenium TestNG Automation Intro (Gradle + Allure)
---

This project contains automated UI tests built using **Selenium WebDriver**, **TestNG**, **Gradle**, and **Allure Reports**. The test cases are designed for the live demo website:  
 **[DailyFinance Web App](https://dailyfinance.roadtocareer.net/)**  
 It includes modular test suites like **Smoke** and **Regression** to support both quick sanity checks and full regression testing.
 
---

##  Test Suites Included

|  Suite         | Description                                      |
|------------------|--------------------------------------------------|
| `smokeSuite`     | Verifies core functionalities are working        |
| `regressionSuite`| Full test suite for in-depth regression testing  |

---

##  Test Cases Overview

|  Test # |  Test Scenario                     |  Duration |
|----------|--------------------------------------|-------------|
| 1       | Admin tries with wrong credentials   | 14s 220ms   |
| 2       | Admin user login                     | 735ms       |
| 3       | Admin logout                         | 114ms       |
| 4       | User login                           | 223ms       |
| 5       | User registration                    | 3s 023ms    |
| 6       | User info edit by admin              | 5s 364ms    |
| 7       | Upload image                         | 3s 288ms    |

 **Total Tests**: 7  
 **Failures**: 0  
 **Errors**: 0  
 **Passed**: 7

---

##  Technologies Used

- **Java 17+**
- **Selenium WebDriver**
- **TestNG**
- **Gradle**
- **Allure Reports** (for test reporting)
- **IDE**: IntelliJ IDEA or Eclipse

---

##  Prerequisites

Before you run the project, make sure you have:

-  **Java JDK 11+** installed
-  **Gradle** installed (or use `./gradlew` wrapper)
-  **Allure CLI** installed and added to your system `PATH`
-  IDE **IntelliJ IDEA** 
-  Google Chrome installed (used in Selenium tests)

---

##  How to Run the Project

###  1. Clone the Repository
```bash
git clone https://github.com/nadim45448/daily-finance-testNG-selenium-intro.git
cd Selenium-TestNG-Intro
```
###  2. Run All Tests (default TestNG suite)
  - IntelIJ > File > select buid.gradle > Open as Project
  - N.B. Collect email and Password 
```bash
gradle clean test
or
gradle clean test -Pemail="" -Ppassword=""
```
###  3. Run Smoke Test Suite
```bash
gradle clean test -PsuiteName="smokeSuite.xml"
```
###  4. Run Regression Test Suite
```bash
gradle clean test -PsuiteName="regressionSuite.xml"
```
###  5.Generate Allure Report
```bash
allure generate allure-results --clean -output
allure serve allure-results
```
---
## Test Reports
  Overview 
  ![1](https://github.com/user-attachments/assets/7b68ddee-cc06-4436-9a23-5da401dd9556) 

  Behaviors  
  ![2](https://github.com/user-attachments/assets/633b6142-f0fe-42cd-bbe9-f6dd61f38810)


  

  





