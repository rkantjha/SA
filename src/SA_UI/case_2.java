package SA_UI;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;


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
        synchronized (one.driver){ one.driver.wait(3000); }
        discovery_and_authentication.search_box(one.driver).sendKeys(discovery_and_authentication.order_id_1);
        discovery_and_authentication.search_box(one.driver).sendKeys(Keys.RETURN);
        //name verification
        synchronized (one.driver){ one.driver.wait(9000); }
        String user_name= discovery_and_authentication.name(one.driver).getText();
        System.out.println(user_name + "   User name is verified ");
        Assert.assertEquals("Vivek keshri",user_name);
        //Account ID verification
        synchronized (one.driver){ one.driver.wait(4000); }
        String account_id=discovery_and_authentication.account_id(one.driver).getText();
        System.out.println(account_id + "Is the account ID");
        Assert.assertEquals("ACC13518860262177453",account_id);



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
     @AfterTest(enabled = false)
    public void close_and_quit()
     {
         System.out.println("All the tests are over");
         one.driver.close();
         one.driver.quit();
     }
    }



