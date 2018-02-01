package SA_UI;

import org.openqa.selenium.*;
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
        System.out.println(account_id + "  Account ID is verified");
        Assert.assertEquals("ACC13518860262177453",account_id);
        //email verification
        String email_id=discovery_and_authentication.email(one.driver).getText();
        System.out.println(email_id + "  Email id is verified");
        Assert.assertEquals("vivekkeshri390@gmail.com",email_id);
        //phone number verification
        String phone_no=discovery_and_authentication.phone(one.driver).getText();
        System.out.println(phone_no+"   Phone number is verified");
        Assert.assertEquals("+917091765088",phone_no);
        //order id verification
        String orders_id=discovery_and_authentication.orders_id(one.driver).getText();
        System.out.println(orders_id+"    Order ID is verified");
        Assert.assertEquals("OD111401472227234000",orders_id);
        synchronized (one.driver){ one.driver.wait(3000); }
        //payment button enable verification
        boolean payment_button=discovery_and_authentication.payment_button(one.driver).isEnabled();
        Assert.assertEquals(payment_button,true);
        //cart button enable verification
        boolean cart_button=discovery_and_authentication.cart_button(one.driver).isEnabled();
        Assert.assertEquals(cart_button,true);
        //close session button enable verification
        boolean session_complete=discovery_and_authentication.complete_session(one.driver).isEnabled();
        Assert.assertEquals(session_complete,true);
        //

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
    public void close_and_quit() {
        System.out.println("  All the tests are over Successfully  ");
        one.driver.close();
        one.driver.quit();
    }

    }



