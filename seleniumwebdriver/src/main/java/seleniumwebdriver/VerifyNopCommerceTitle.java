package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyNopCommerceTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://demo.nopcommerce.com/");

            String actual = driver.getTitle();

            // Current title (as you saw in output)
            String expected = "nopCommerce demo store. Home page title";

            if (actual.equals(expected)) {
                System.out.println("PASS: " + actual);
            } else {
                System.out.println("FAIL");
                System.out.println("Expected: " + expected);
                System.out.println("Actual  : " + actual);
            }
        } finally {
            driver.quit();
        }
    }
}