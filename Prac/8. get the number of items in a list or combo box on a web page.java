package prac8;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Prac8{
    static String driverPath = "C:\\Users\\arunv\\Desktop\\st\\JAR\\geckodriver.exe";
    public static WebDriver driver;
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver",driverPath);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("38.0.5");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);
        driver= new FirefoxDriver(capabilities);
        driver.get("C:\\Users\\arunv\\Desktop\\st\\8\\combo.html");
        java.util.List<WebElement> optionCount = 
        driver.findElements(By.xpath("//select/option"));
        System.out.println("Number of Options in the Combo Box is "+ 
        optionCount.size());
        for (int i = 0; i<optionCount.size(); i=i+1)
        {
            System.out.println(optionCount.get(i).getText());
        }
    }
}

//selenium java client and server standalone
// combobox html
