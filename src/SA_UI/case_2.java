package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;
import pom_elements.order_details;
import SA_UI.ExcelData;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class case_2 {

    case_1 one=new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();

    public case_2() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass()
    { System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true)
    public void UiDataVerify() throws InterruptedException {
        one.login();

        synchronized (one.driver){ one.driver.wait(3000); }

        call_to_customer.new_session(one.wb,one.driver).click();

        synchronized (one.driver){ one.driver.wait(6000); }
        WebElement searchBox = discovery_and_authentication.search_box(one.wb,one.driver);
        searchBox.sendKeys(discovery_and_authentication.order_id_1);
        searchBox.sendKeys(Keys.RETURN);

        synchronized (one.driver){ one.driver.wait(9000); }

        //name verification
        String user_name = discovery_and_authentication.name(one.wb,one.driver).getText();
        System.out.println(user_name + "   User name is verified ");
        Assert.assertEquals("Vivek keshri",user_name);

        synchronized (one.driver){ one.driver.wait(4000); }

        //Account ID verification
        String account_id=discovery_and_authentication.account_id(one.wb,one.driver).getText();
        System.out.println(account_id + "  Account ID is verified");
        Assert.assertEquals("ACC13518860262177453",account_id);
        //email verification
        String email_id=discovery_and_authentication.email(one.wb,one.driver).getText();
        System.out.println(email_id + "  Email id is verified");
        Assert.assertEquals("vivekkeshri390@gmail.com",email_id);
        //phone number verification
        String phone_no=discovery_and_authentication.phone(one.wb,one.driver).getText();
        System.out.println(phone_no+"   Phone number is verified");
        Assert.assertEquals("+917091765088",phone_no);
        //order id verification
        String orders_id=discovery_and_authentication.orders_id(one.wb,one.driver).getText();
        System.out.println(orders_id+"    Order ID is verified");
        Assert.assertEquals("OD111401472227234000",orders_id);

        synchronized (one.driver){ one.driver.wait(3000); }

        //payment button enable verification
        boolean payment_button=discovery_and_authentication.payment_button(one.wb,one.driver).isEnabled();
        Assert.assertEquals(payment_button,true);
        //cart button enable verification
        boolean cart_button=discovery_and_authentication.cart_button(one.wb,one.driver).isEnabled();
        Assert.assertEquals(cart_button,true);
        //close session button enable verification
        boolean session_complete=discovery_and_authentication.complete_session(wb,one.driver).isEnabled();
        Assert.assertEquals(session_complete,true);

        synchronized (one.driver){ one.driver.wait(3000); }

        //Home button enable check
        boolean home_button=discovery_and_authentication.home(wb,one.driver).isEnabled();
        Assert.assertEquals(home_button,true);
        //yoda button enable check
        boolean yoda_button=discovery_and_authentication.yoda(wb,one.driver).isEnabled();
        Assert.assertEquals(yoda_button,true);
        //back to discovery enable check
        boolean back2_discovery_button=discovery_and_authentication.back_to_discovery(wb,one.driver).isEnabled();
        Assert.assertEquals(back2_discovery_button,true);
        //session navigator enable check
        boolean session_nav=discovery_and_authentication.session_navigator(wb,one.driver).isEnabled();
        Assert.assertEquals(session_nav,true);
        // Excalate issue enable check
        boolean excalate=discovery_and_authentication.excalate_issue(wb,one.driver).isEnabled();
        Assert.assertEquals(excalate,true);
        //Take a break enable check
        synchronized (one.driver){ one.driver.wait(3000); }
        boolean take_break=discovery_and_authentication.take_a_break(wb,one.driver).isEnabled();
        Assert.assertEquals(take_break,true);

        synchronized (one.driver){ one.driver.wait(3000); }

        //show selector button enable check
        boolean show_selector=discovery_and_authentication.show_selector(wb,one.driver).isEnabled();
        Assert.assertEquals(show_selector,true);
        //profile button enable check
        boolean profile=discovery_and_authentication.profile_button(wb,one.driver).isEnabled();
        Assert.assertEquals(profile,true);
        //logged in user name enable check

        discovery_and_authentication.profile_button(one.wb,one.driver).click();//open profile menu

        boolean logged_in_user=discovery_and_authentication.logged_in_user_name(wb,one.driver).isEnabled();
        Assert.assertEquals(logged_in_user,true);
        //account menu button enable check
        boolean account_info=discovery_and_authentication.account(wb,one.driver).isEnabled();
        Assert.assertEquals(account_info,true);
        //change password enable check
        boolean pass_change=discovery_and_authentication.change_password(wb,one.driver).isEnabled();
        Assert.assertEquals(pass_change,true);
        //logout button enable check
        boolean log_out=discovery_and_authentication.change_password(wb,one.driver).isEnabled();
        Assert.assertEquals(log_out,true);

        synchronized (one.driver){ one.driver.wait(3000); }

        //session enable yes-no button enable check
        boolean assign=discovery_and_authentication.assign_yes(wb,one.driver).isEnabled();
        Assert.assertEquals(assign,true);

        //When assign is active take a break should be disabled.
        if(assign==true)
        { one.driver.navigate().refresh();

          synchronized (one.driver){ one.driver.wait(3000); }

          discovery_and_authentication.assign_yes(wb,one.driver).click();

             synchronized (one.driver){ one.driver.wait(4000); }

            boolean yes_on=discovery_and_authentication.break_dis(wb,one.driver).isEnabled();
          Assert.assertEquals(yes_on,true);
        }

        //click on assign to no from yes
        discovery_and_authentication.assign_to_no(wb,one.driver).click();
    }
    @Test(priority=2,enabled=false)//logic pending
    public void order_details()throws InterruptedException
    {
        //order date verification
        String ordered_on=order_details.ordered_on(wb,one.driver).getText();
        System.out.println(ordered_on+"    date is verified ");
        Assert.assertEquals("28 Jan 18, 10:43 PM",ordered_on);
        //total price verification
        String tp=order_details.total_price(wb,one.driver).getText();
        System.out.println(tp+"  total price is verified");
        Assert.assertEquals("14599",tp);
        //channel verification
        String cv=order_details.channel(wb,one.driver).getText();
        System.out.println(cv+"  is the name of the channel");
        Assert.assertEquals("AndroidApp",cv);


        //order verification dt enable check (email profile)
        boolean ov_dt=order_details.order_verification_dt(wb,one.driver).isEnabled();
        Assert.assertEquals(ov_dt,"false");
        //create incident dt verification enable check(email profile)

        boolean ci_dt=order_details.create_incident_dt(wb,one.driver).isEnabled();
        Assert.assertEquals(ci_dt,"false");
        //price adjustment dt enable check(email profile)
        boolean pa_dt=order_details.price_adjustments_dt(wb,one.driver).isEnabled();
        Assert.assertEquals(pa_dt,"false");
        //cancle dt enable check
        boolean cdt=order_details.cancel_dt(wb,one.driver).isEnabled();
        Assert.assertEquals(cdt,"false");



    }
    @Test(priority=3,enabled=true)
    public void payment_details()
    {
        System.out.println("test");
    }

    @Test(priority=4,enabled=true)
     public void address_details() {  System.out.println("test"); }

    @AfterTest(enabled = true)

    public  void close_and_quit() {

        System.out.println(" Quitting the session ");
        one.driver.close();
        one.driver.quit();
    }

    }