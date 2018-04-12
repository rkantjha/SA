package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.address_detail;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;
import pom_elements.order_wise;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.NoSuchElementException;


public class case_3 extends ExcelData {

  public case_1 one = new case_1();
  XSSFWorkbook wb = ExcelData.bootstrap();
    public static XSSFSheet sh;

    public case_3() throws IOException {
    }
    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test(priority =0,enabled = true,groups="three")
    public void login()throws InterruptedException
    {
        one.login();
        synchronized (one.driver) { one.driver.wait(6000); }
    }

    @Test(priority=1,enabled=true,groups="three")
    public void  cash_back()  throws InterruptedException
    {
            //click on new session
            call_to_customer.new_session(one.wb,one.driver).click();
            synchronized (one.driver) { one.driver.wait(6000); }

            //search for order id
            WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
            synchronized (one.driver) { one.driver.wait(6000); }

            searchBox.sendKeys(Keys.RETURN);

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
            //order details
            //payment details
            //address
            //payment history
            //dt verification
            //show selectors(incident,return,replacement,refund,service,callback)
            //hide selectors
            //close session
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
    public void  cashback_detail()throws InterruptedException
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
    @AfterTest(enabled = true,groups="three")
    public void close_and_quit() {

        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }

}
