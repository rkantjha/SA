import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pom_elements.login_page;
import java.util.List;


public class salogin
{
      public static void main(String[] args) throws InterruptedException {


            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");   //Fierfox driver
            driver = new FirefoxDriver();

            DesiredCapabilities capabilities = DesiredCapabilities.firefox(); // setting the desired capabilities
            capabilities.setCapability("marionette", true); // setting the desired capabilities


            String url = "http://10.85.53.223/flipkart/";

// Login Starts
            driver.get(url);
            driver.manage().window().maximize();


            driver.findElement(By.className("inputStyle")).sendKeys("rahul.kant");
            List<WebElement> elements = driver.findElements(By.className("inputStyle"));
            WebElement username = elements.get(0);
            username.sendKeys(Keys.ENTER);

            synchronized (driver)
            {
                driver.wait(2000);
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

//Login ends

            synchronized (driver)
            {
            driver.wait(2000);
            }

//Check yoda notification page before proceeding to SA starts

            String currentUrl = driver.getCurrentUrl();
            String yoda_page_url = "http://10.85.52.152/flipkart/#/yoda";

            if (currentUrl == yoda_page_url)
            {
                String yoda_count = driver.findElement(By.className("client-container-pages-Yoda-Notifications-Notifications_text client-container-pages-Yoda-Notifications-Notifications_staticText")).getText();

                System.out.println("Notifications count needs to be checked is" + yoda_count);
            }
            else
            {
                System.out.println(" Notifications already checked,check not required ");

            }
// Yoda notification check ends

// Home page URL validation starts
        synchronized (driver)
        {
            driver.wait(2000);
        }

        String home_page_url = "http://10.85.52.152/flipkart/#/";

        String Current_home_page_url = driver.getCurrentUrl();

            if(Current_home_page_url == home_page_url)
            {
               System.out.println("User successfully landed to homepage");
            }
            else
            {
                System.out.println("user is landed to  " + driver.getCurrentUrl());
            }
//Home page URL validation ends
        synchronized (driver)
        {
            driver.wait(2000);
        }

//browser refresh
        driver.navigate().refresh();
            // browser refresh ends

// login to inbound to outbound and make a call to customer and then logout from inbound-to-outbound

         /* clicking on call dropdown*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]")).click();
        synchronized (driver)
        {
            driver.wait(1000);
        }
        /* selecting options*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).click();

        synchronized (driver)
        {
            driver.wait(1000);
        }
        /* entering extension for inbound to outbound*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/input")).sendKeys("3029");
        /* clicking on login button*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[3]/div/div[1]/div")).click();
        /* clicking on assign yes button*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[3]/div[1]/div/div/div[1]")).click();
        /* clicking on call button*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/img")).click();
        /* clicking on make a call button*/
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div/div[2]/div[4]/div/div[1]/div/img")).click();



//

        }
    }



