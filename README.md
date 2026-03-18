# Selenium WebDriver (Java + Maven + VS Code)

This repository contains my Selenium WebDriver practice code using:

- Java 21
- Selenium `4.18.1`
- Maven
- VS Code (no IntelliJ required)

## Project Structure

- Java source code: `src/main/java/seleniumwebdriver/`
- Maven build output: `target/` (auto-generated)

## Prerequisites

- Install **Java 21** (JDK)
- Install **Maven**
- Install **Google Chrome**
- VS Code extensions (recommended):
  - Extension Pack for Java
  - Maven for Java

> Note: On restricted/corporate networks, some browser drivers may not download automatically. Chrome is used as the default browser in this repo.

## How to Run (Windows PowerShell)

First, go to the project folder (where `pom.xml` exists):

```powershell
cd C:\Users\2478606\Documents\codespace\Selenium\seleniumwebdriver
```

### Run the default class
If `pom.xml` has the default `exec.mainClass` set, run:

```powershell
mvn -U clean compile exec:java
```

### Run a specific class
Use `-Dexec.mainClass`:

```powershell
mvn -U clean compile exec:java "-Dexec.mainClass=seleniumwebdriver.VerifyNopCommerceTitle"
```

Example (open example.com):

```powershell
mvn -U clean compile exec:java "-Dexec.mainClass=seleniumwebdriver.Second"
```

## What I Practiced (Day-21)

### Basic WebDriver flow
1. Launch browser
2. Open URL
3. Validate title
4. Close browser (`driver.quit()`)

### Topics covered / planned
- Locators: `By.id`, `By.name`, `By.cssSelector`, `By.xpath`, `By.linkText`
- Actions: `click()`, `sendKeys()`, `getText()`, `clear()`
- Waits (important): `WebDriverWait`, `ExpectedConditions`
- Assertions: currently using basic `if/else`; later JUnit/TestNG

## Notes / Common Warnings

### CDP Warning
You may see a warning like:
- `Unable to find CDP implementation matching ...`

This usually happens when Chrome version is newer than the Selenium DevTools mapping. Selenium normal actions still work, so it can be ignored for beginner practice.

## Useful Links
- Selenium: https://www.selenium.dev/
- Maven Repository: https://mvnrepository.com/
- nopCommerce demo site: https://demo.nopcommerce.com/