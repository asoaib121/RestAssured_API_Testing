# 🧪 Swagger User API Automation Framework

This project is an automated testing framework for the **Swagger Petstore User API**, developed using Java, RestAssured, TestNG, and ExtentReports.

It helps automate testing of endpoints such as **Create**, **Read**, **Update**, and **Delete** (CRUD operations) for user data.

---

## 📁 Project Structure Overview
PetstoreAutomationFramework/
├── Reports
├── logs/ # Logs generated during execution
├── testData/ # Excel file containing test data
├── src/
│ └── test/
│ └── java/
│ ├── api/
│ │ ├── endpoints/ # API route classes
│ │ ├── payload/ # POJO classes for request bodies
│ │ ├── report/ # ExtentReport configuration
│ │ ├── test/ # Test classes
│ │ └── utilities/ # Utilities (e.g., data providers, Excel reader)
│
│ └── resources/
│ ├── log4j2.xml # Logging configuration
│ └── routes.properties # API routes and URIs
│
├── pom.xml # Maven build file
├── testng.xml # TestNG suite configuration
└── README.md # Project documentation

---

## 🔧 Technologies Used

- **Java 17**
- **Maven**
- **TestNG**
- **RestAssured**
- **ExtentReports**
- **Apache POI** (for Excel)
- **Log4j2**

---

## 🚀 Features

- ✅ Automated API Testing using RestAssured
- 📊 HTML reports using ExtentReports
- 📁 Data-driven testing using Excel sheets
- 🗂️ Centralized route management with `routes.properties`
- 🔒 Logging support using Log4j2

---

## 🔨 Prerequisites

- Java 17 installed
- Maven installed
- IDE (e.g., IntelliJ IDEA)
- Internet connection for Maven dependencies

---

## ⚙️ How to Run the Tests

### 1. Clone the Repository

```bash
git clone https://github.com/asoaib121/Swagger_User_API_Testing.git
or
download the ZIP and extract it.

### 2. Open the Project
Open the project in IntelliJ IDEA (or any Java IDE).
Wait for Maven to download all required dependencies.

### 3. Modify Test Data (Optional)
Edit the test data inside

testData/UserData.xlsx

you can change username, emails, or other user info.

### 4. Run the Tests

Option 1: From IntelliJ
**Open testng.xml
**Right-click and select Run 'testng.xml'

Option 2: Using Command Line
**mvn clean test
This will execute all test cases defined in testng.xml

###View Test Report
After test execution, an HTML report is generated (configured using ExtentReports).

Find the report in the output folder or the location set in ExtentReportManager.java.

### API Endpoints Covered
**Create User
**Get User by Username
**Update User
**Delete User
These are implemented in UserTests.java or UserTest2.java any one.


### License
## 📌 What to do next:

1. Open your project folder.
2. Create a file named `README.md`.
3. Paste the content above into it.
4. Commit and push it:

```bash
git add README.md
git commit -m "Added complete README"
git push


👤 Author
Shoaib
Computer Science and Engineer
Green University of Bangladesh
GitHub: github.com/asoaib121
