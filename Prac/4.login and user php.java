package prac4;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Prac4 {

    public static void main(String[] args) 
    {
 
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunv\\Downloads\\selenium zip\\geckodriver.exe");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("38.0.5");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);

        WebDriver driver=new FirefoxDriver (capabilities);
        driver.get("C:\\xampp\\htdocs\\login.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("test");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("button")).click();
    }
}

// 1. Selenium java client
// 2. Selenium standalone
// login and user php in htdocs
//login html should contain the file location of php


