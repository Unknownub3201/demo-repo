
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Seleniumgcd {

    public static void main(String[] args) {

        
    System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
    DesiredCapabilities capabilities=new DesiredCapabilities();
    capabilities = DesiredCapabilities.firefox();
    capabilities.setBrowserName("firefox");
    capabilities.setVersion("38.0.5");
    capabilities.setPlatform(Platform.WINDOWS);
    capabilities.setCapability("marionette", false);
    
    WebDriver driver=new FirefoxDriver (capabilities);
    driver.get("C:\\Users\\admin\\Documents\\Gcd.html");
    driver.manage().window().maximize();
    driver.findElement(By.name("n1")).sendKeys("14");
    driver.findElement(By.name("n2")).sendKeys("28");
    driver.findElement(By.name("btn")).click();
    String result=driver.findElement(By.name("result")).getAttribute("value");
    System.out.println("GCD is"+result);
    }

    }
