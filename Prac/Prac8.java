package listcount;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ListCount extends SeleneseTestCase{
static String driverPath = "D:\\selenium\\geckodriver.exe";
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
driver.get("file:///C:/Users/admin/Desktop/Combo.html");
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

