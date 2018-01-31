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

    case_1 one=new case_1();
    
    @BeforeTest
    public static void BeforeClass()
    { System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true)
    public void UiDataVerify() throws InterruptedException {
        one.login();
        synchronized (one.driver){ one.driver.wait(3000); }
        call_to_customer.new_session(one.driver).click();
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
     {  System.out.println("test");
     }
     @AfterTest(enabled = true)
    public void close_and_quit()
     {
         System.out.println("All the tests are over");
         one.driver.close();
         one.driver.quit();
     }
    }



