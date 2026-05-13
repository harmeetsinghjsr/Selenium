package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LessonA_RegisterLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://demo.nopcommerce.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 1) linkText
            By register1 = By.linkText("Register");

            // // 2) cssSelector
            // By register2 = By.cssSelector("a[href*='/register']");

            // // 3) xpath
            // By register3 = By.xpath("//a[normalize-space()='Register']");

            // Pick ONE locator to use (change register1 -> register2 or register3 to practice)
            wait.until(ExpectedConditions.elementToBeClickable(register1)).click();

            System.out.println("After clicking Register, URL: " + driver.getCurrentUrl());
        } finally {
            driver.quit();
        }
    }
}