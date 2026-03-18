package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();   // 1) open Chrome
        try {
            driver.get("https://github.com/");  // 2) open website

            String title = driver.getTitle();    // 3) read title
            System.out.println("Title is: " + title);

            if (title.contains("GitHub")) {     // 4) simple validation
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } finally {
            driver.quit();                       // 5) close browser
        }
    }
}