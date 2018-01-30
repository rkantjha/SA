package SA_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;


public class case_2 {

    WebDriver driver=new ChromeDriver();
    case_1 one=new case_1();
    call_to_customer c_t_c=new call_to_customer();
    JavascriptExecutor jse = (JavascriptExecutor)driver;


    @BeforeTest
    public static void BeforeClass()
    { System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true)
    public void UiDataVerify() throws InterruptedException {
        one.login();
        synchronized (driver){ driver.wait(3000); }
        c_t_c.new_session(driver).click();
    }

    @Test(priority=2,enabled=true)
    public void order_details()
    {
        System.out.println("test");
    }

    @Test(priority=3,enabled=true)
    public void payment_details()
    {
        System.out.println("test");
    }

     @Test(priority=4,enabled=true)
    public void address_details()
     {
         System.out.println("test");
     }
     @AfterTest
    public void close_and_quit()
     {
         System.out.println("All the tests are over");
         driver.close();
         driver.quit();
     }
    }



