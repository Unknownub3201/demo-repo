package prac9;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import com.thoughtworks.selenium.*;

public class Prac9 {

    public static void main(String[] args) 
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\arunv\\Downloads\\selenium zip\\geckodriver.exe");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("38.0.5");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);

        WebDriver driver=new FirefoxDriver (capabilities);
        driver.get("http://browsershots.org/");

        java.util.List<WebElement> c =  driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Count of Check boxes  "+c.size());

        java.util.List<WebElement> d =  driver.findElements(By.xpath("//input[@type='checkbox' and @checked]"));
        System.out.println("Count of Check boxes Checked  "+d.size());

        java.util.List<WebElement> e =  driver.findElements(By.xpath("//input[@type='checkbox' and not(@checked)]"));
        System.out.println("Count of Check boxes Not Checked  "+e.size());
    
    }
}

//selenium java client and server standalone

