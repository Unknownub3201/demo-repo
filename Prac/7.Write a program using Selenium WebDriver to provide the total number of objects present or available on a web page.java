package prac7;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Prac7 
{
    static String driverPath = "C:\\Users\\arunv\\Downloads\\selenium zip\\geckodriver.exe";
    public static WebDriver driver;
    public static void main(String args[])
    {
        String driverPathStr = driverPath;
        System.setProperty("webdriver.gecko.driver", driverPathStr);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("38.0.5");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);
        driver= new FirefoxDriver(capabilities);
        driver.get("https://www.wikipedia.org/");
        java.util.List<WebElement> links =
        driver.findElements(By.tagName("a"));
        System.out.println("Total links are"+links.size());
        for (int i = 0; i<links.size(); i=i+1)
        {
            System.out.println("Link "+ i + " Link name "+ links.get(i).getText());
        }
    }
}

//selenium java client and selenium server standalone
//website link as argument

