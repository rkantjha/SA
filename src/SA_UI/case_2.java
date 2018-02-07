package SA_UI;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;
import SA_UI.ExcelData;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class case_2 {

    case_1 one=new case_1();
    ExcelData ExcelData = new ExcelData();
    XSSFWorkbook wb = ExcelData.bootstrap();

    public case_2() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass()
    { System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true)
    public void UiDataVerify() throws InterruptedException {
        one.login(wb);

        synchronized (one.driver){ one.driver.wait(3000); }

        call_to_customer.new_session(one.driver).click();

        synchronized (one.driver){ one.driver.wait(3000); }

        discovery_and_authentication.search_box(one.driver).sendKeys(discovery_and_authentication.order_id_1);
        discovery_and_authentication.search_box(one.driver).sendKeys(Keys.RETURN);

        synchronized (one.driver){ one.driver.wait(9000); }

        //name verification
        String user_name= discovery_and_authentication.name(one.driver).getText();
        System.out.println(user_name + "   User name is verified ");
        Assert.assertEquals("Vivek keshri",user_name);

        synchronized (one.driver){ one.driver.wait(4000); }

        //Account ID verification
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

        synchronized (one.driver){ one.driver.wait(3000); }

        //Home button enable check
        boolean home_button=discovery_and_authentication.home(one.driver).isEnabled();
        Assert.assertEquals(home_button,true);
        //yoda button enable check
        boolean yoda_button=discovery_and_authentication.yoda(one.driver).isEnabled();
        Assert.assertEquals(yoda_button,true);
        //back to discovery enable check
        boolean back2_discovery_button=discovery_and_authentication.back_to_discovery(one.driver).isEnabled();
        Assert.assertEquals(back2_discovery_button,true);
        //session navigator enable check
        boolean session_nav=discovery_and_authentication.session_navigator(one.driver).isEnabled();
        Assert.assertEquals(session_nav,true);
        // Excalate issue enable check
        boolean excalate=discovery_and_authentication.excalate_issue(one.driver).isEnabled();
        Assert.assertEquals(excalate,true);
        //Take a break enable check
        boolean take_break=discovery_and_authentication.take_a_break(one.driver).isEnabled();
        Assert.assertEquals(take_break,true);

        synchronized (one.driver){ one.driver.wait(3000); }

        //show selector button enable check
        boolean show_selector=discovery_and_authentication.show_selector(one.driver).isEnabled();
        Assert.assertEquals(show_selector,true);
        //profile button enable check
        boolean profile=discovery_and_authentication.profile_button(one.driver).isEnabled();
        Assert.assertEquals(profile,true);
        //logged in user name enable check


        discovery_and_authentication.profile_button(one.driver).click();//open profile menu


        boolean logged_in_user=discovery_and_authentication.logged_in_user_name(one.driver).isEnabled();
        Assert.assertEquals(logged_in_user,true);
        //account menu button enable check
        boolean account_info=discovery_and_authentication.account(one.driver).isEnabled();
        Assert.assertEquals(account_info,true);
        //change password enable check
        boolean pass_change=discovery_and_authentication.change_password(one.driver).isEnabled();
        Assert.assertEquals(pass_change,true);
        //logout button enable check
        boolean log_out=discovery_and_authentication.change_password(one.driver).isEnabled();
        Assert.assertEquals(log_out,true);

        synchronized (one.driver){ one.driver.wait(3000); }

        //session enable yes-no button enable check
        boolean assign=discovery_and_authentication.assign_yes(one.driver).isEnabled();
        Assert.assertEquals(assign,true);

        //When assign is active take a break should be disabled.
        if(assign==true)
        { one.driver.navigate().refresh();

          synchronized (one.driver){ one.driver.wait(3000); }

          discovery_and_authentication.assign_yes(one.driver).click();

             synchronized (one.driver){ one.driver.wait(4000); }

            boolean yes_on=discovery_and_authentication.break_dis(one.driver).isEnabled();
          Assert.assertEquals(yes_on,true);
        }

        //click on assign to no from yes
        discovery_and_authentication.assign_to_no(one.driver).click();
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
     public void address_details() {  System.out.println("test"); }



    @AfterTest(enabled = true)
    public void close_and_quit() {

        System.out.println("  All tests are over Successfully  ");
        one.driver.close();
        one.driver.quit();
    }

    }