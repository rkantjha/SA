import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.List;

public class salogin
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver" ); // Fierfox driver
        driver =new FirefoxDriver();

        DesiredCapabilities capabilities = DesiredCapabilities.firefox(); // setting the desired capabilities
        capabilities.setCapability("marionette", true); // setting the desired capabilities


        String url = "http://10.85.52.152/flipkart/";

            driver.get(url);
            driver.manage().window().maximize();


            driver.findElement(By.className("inputStyle")).sendKeys("rahul.kant");
            List<WebElement> elements = driver.findElements(By.className("inputStyle"));
            WebElement username = elements.get(0);
            username.sendKeys(Keys.ENTER);

            synchronized (driver)
            {
                driver.wait(1000);
            }

            List<WebElement> passwordElement = driver.findElements(By.className("inputStyle"));
            WebElement password = passwordElement.get(1);
            password.sendKeys("Rahul@12345");
            driver.findElement(By.className("loginButton")).click();


            synchronized (driver)
            {
            driver.wait(2000);
            }

            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/button")).click();
            driver.findElement(By.className("loginButton")).click();

            synchronized (driver)
            {
            driver.wait(2000);
            }

            String currentUrl = driver.getCurrentUrl();
            String yoda_page_url = "http://10.85.52.152/flipkart/#/yoda";

            if (currentUrl == yoda_page_url)
            {
                driver.findElement(By.className("client-container-pages-Yoda-Notifications-Notifications_text client-container-pages-Yoda-Notifications-Notifications_staticText")).getText();


            }






        }





    }



