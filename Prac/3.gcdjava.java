package prac3;

//IMPORTING SELENIUM LIBRARIES

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Prac3 {

public static void main(String[] args) {

        
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunv\\Downloads\\selenium zip\\geckodriver.exe");
    DesiredCapabilities capabilities=new DesiredCapabilities();
    capabilities = DesiredCapabilities.firefox();
    capabilities.setBrowserName("firefox");
    capabilities.setVersion("38.0.5");
    capabilities.setPlatform(Platform.WINDOWS);
    capabilities.setCapability("marionette", false);
    
    WebDriver driver=new FirefoxDriver (capabilities);
    driver.get("C:\\Arun\\ST\\prac3\\gcd.html");
    driver.manage().window().maximize();
    driver.findElement(By.name("n1")).sendKeys("14");
    driver.findElement(By.name("n2")).sendKeys("28");
    driver.findElement(By.name("btn")).click();
    String result=driver.findElement(By.name("result")).getAttribute("value");
    System.out.println("GCD is "+result);
    }

}


 

//1 . Selenium-java-client-driver-1.0.1.jar
//2. Selenium-server-standalone-3.13.0.jar
//3. Geckodriver
//4. html file

