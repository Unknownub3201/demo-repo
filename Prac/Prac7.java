package oc;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OC {
static String driverPath = "D:\\selenium\\geckodriver.exe";
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
driver.get("https://www.google.com/");
java.util.List<WebElement> links =
driver.findElements(By.tagName("a"));
System.out.println("Total links are"+links.size());
for (int i = 0; i<links.size(); i=i+1)
{
System.out.println("Link "+ i + " Link name "+ links.get(i).getText());
}
}
}

