package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator{
public static WebDriver driver;
public static WebElement paymentElmt;
String baseUrl="https://webapps.tekstac.com/RentaCar/";
public WebDriver createDriver(){
try{
driver=DriverSetup.getDriver();
driver.get(baseUrl);
}catch(ExceptionInInitializerError e){
return null;
}
return driver;
}
public WebElement getNameLocator(){
try{
paymentElmt=driver.findElement(By.name("payment"));
}catch(ExceptionInInitializerError e){
}
return paymentElmt;
}
public static void main(String[] args) throws Exception{
Locator nameLocator=new Locator();
nameLocator.createDriver();
Thread.sleep(3000);
WebElement btnElmt=nameLocator.getNameLocator();
System.out.println("The Payment mode is "+btnElmt.getAttribute("value"));
Thread.sleep(2000);
driver.quit();
}
}