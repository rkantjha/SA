package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.*;

import java.io.IOException;
import java.util.List;


public class case_3 extends ExcelData {

      public case_1 one = new case_1();
      XSSFWorkbook wb = ExcelData.bootstrap();
      DTActions dtActions = new DTActions();
      public static XSSFSheet sh;

    public case_3() throws IOException {
    }
    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }
    @Test(priority=0,enabled=true,groups="three")
    public void login()throws InterruptedException
    {
        one.login();
        synchronized (one.driver) { one.driver.wait(4000); }
    }

    @Test(priority=1,enabled=true,groups="three")
    public void  cash_back()  throws InterruptedException
    {
            //click on new session
            call_to_customer.new_session(one.wb,one.driver).click();
            synchronized (one.driver) { one.driver.wait(4000); }

            //search for order id
            WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
            synchronized (one.driver) { one.driver.wait(6000); }
            searchBox.sendKeys(discovery_and_authentication.order_id_3);

            searchBox.sendKeys(Keys.RETURN);
            synchronized (one.driver) { one.driver.wait(8000); }

            //name
            String user_name = discovery_and_authentication.name(one.wb, one.driver, 3, 1, 2).getText();
            System.out.println(user_name);
            Assert.assertEquals("Ramki", user_name);

            //phone
            String phone_no = discovery_and_authentication.phone(one.wb, one.driver, 3, 1, 3).getText();
            System.out.println(phone_no + "is the phone number");
            Assert.assertEquals("+919003276122", phone_no);
            //email
            String email_id = discovery_and_authentication.email(one.wb, one.driver, 3, 1, 4).getText();
            System.out.println(email_id + "is the email id");
            Assert.assertEquals(email_id, "ramki221994@gmail.com");
            //account id
            String account_id = discovery_and_authentication.account_id(one.wb, one.driver, 3, 1, 5).getText();
            System.out.println(account_id + "account id is verified");
            Assert.assertEquals(account_id, "ACC14074063501296331");

            //order details verification

            //order date verification
            String ordered_on = order_details.ordered_on(wb, one.driver,3,1,6).getText();
            System.out.println(ordered_on + "    date is verified ");
            Assert.assertEquals("13 Jun 17, 11:01 PM", ordered_on);
             //total price verification
            String tp = order_details.total_price(wb, one.driver,3,1,7).getText();
            System.out.println(tp + "  total price is verified");
            Assert.assertEquals("699", tp);
             //channel name verification
            String cv = order_details.channel(wb, one.driver,3,1,8).getText();
            System.out.println(cv + "  is the name of the channel");
            Assert.assertEquals("AndroidApp", cv);

        /* Don't remove this wait */
        synchronized (one.driver) {one.driver.wait(5000); }

        //Getting DT Actions
        List<WebElement> actions = order_details.order_verification_dt(wb, one.driver);

        //order verification dt enable check (email profile)
        boolean ov_dt = dtActions.findDTActiveStatus(actions,one.driver,"Order Verification");
        Assert.assertEquals(ov_dt, false);

        //create incident dt verification enable check(email profile)
        boolean ci_dt =  dtActions.findDTActiveStatus(actions,one.driver,"Create Incident");
        Assert.assertEquals(ci_dt, false);

        //Price adjustment dt enable check(email profile)
        boolean pa_dt = dtActions.findDTActiveStatus(actions,one.driver,"Price Adjustment");
        Assert.assertEquals(pa_dt, false);

            //payment details

            //address
            //payment history
            //dt verification
            //show selectors(incident,return,replacement,refund,service,callback)
            //hide selectors
            //close session
        synchronized (one.driver) {one.driver.wait(8000);}
        discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();
    }
    @Test(priority=2,enabled=true,groups="three")
    public void  ndr()throws InterruptedException,IOException {

        //click on new session

        /*
        search
        name,phone,email,account id
        order details
        payment details
        address
        payment history
        dt verification
        show selectors(incident,return,replacement,refund,service,callback)
        hide selectors
        */
    }

    @Test(priority=3,enabled=true,groups="three")
    public void  grocery()throws InterruptedException
    {
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=4,enabled=true,groups="three")
    public void  Refund()throws InterruptedException
    {
        System.out.println("mps test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors

    }
    @Test(priority=5,enabled=true,groups="three")
    public void  Blacklisted()throws InterruptedException
    {
        System.out.println("doorship test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=6,enabled=true,groups="three")
    public void  ABB()throws InterruptedException
    {
        System.out.println("delivery_installation test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=7,enabled=true,groups="three")
    public void  Ecode()throws InterruptedException
    {
        System.out.println("blacklisted test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=8,enabled=true,groups="three")
    public void  ADLD()throws InterruptedException
    {
        System.out.println("abb test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=9,enabled=true,groups="three")
    public void  EGV()throws InterruptedException
    {
        System.out.println("ecode test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=10,enabled=true,groups="three")
    public void  BNPL()throws InterruptedException
    {
        System.out.println("adld test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=11,enabled=true,groups="three")
    public void  MPS()throws InterruptedException
    {
        System.out.println("egv test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=12,enabled=true,groups="three")
    public void  Large_Order()throws InterruptedException
    {
        System.out.println("non test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=13,enabled=true,groups="three")
    public void  Replacement_back_from_return()throws InterruptedException
    {
        System.out.println("associate test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=14,enabled=true,groups="three")
    public void  Dropship()throws InterruptedException
    {
        System.out.println("priority test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=15,enabled=true,groups="three")
    public void  Large()throws InterruptedException
    {
        System.out.println("f_first test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }

    @Test(priority=16,enabled=true,groups="three")
    public void  cash_back_detail()throws InterruptedException
    {
        System.out.println("cashback_detail test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @Test(priority=17,enabled=true,groups="three")
    public void  door_ship_and_mps()throws InterruptedException
    {
        System.out.println("doorship_and_mps test passed ");
        //new session
        //search
        //name,phone,email,account id
        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors
    }
    @AfterTest(enabled = false,groups="three")
    public void close_and_quit() {

        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }

}
