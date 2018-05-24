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
        synchronized (one.driver) { one.driver.wait(8000); }
    }

    @Test(priority=1,enabled=true,groups="three")
    public void  cash_back()  throws InterruptedException
    {
        //OD109423037514652000

            //click on new session
            call_to_customer.new_session(one.wb,one.driver).click();
            synchronized (one.driver) { one.driver.wait(4000); }

            //search for order id
            WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
            synchronized (one.driver) { one.driver.wait(6000); }

            searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 1, 1, 1));
        
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


//payment details tab verification

        //Click on payment details tab
        synchronized (one.driver) {one.driver.wait(8000);}
        payment_details.payment_details_tab(wb,one.driver).click();
        //Selling price verification
        String s_price = payment_details.selling_price(wb, one.driver,3,1,9).getText();
        Assert.assertEquals("699", s_price);

        /* Don't remove this wait */
        synchronized (one.driver) {one.driver.wait(8000);}

        List<WebElement> actions_1 = payment_details.payments_details_all_DT(wb,one.driver);

        boolean payments_and_refunds = dtActions.findDTActiveStatus(actions_1,one.driver,"Payments and Refunds");
        Assert.assertEquals(payments_and_refunds, false);

        boolean down_inv = dtActions.findDTActiveStatus(actions_1,one.driver,"Download Invoice");
        Assert.assertEquals(down_inv, true);

        boolean inv_req = dtActions.findDTActiveStatus(actions_1,one.driver,"Invoice Request");
        Assert.assertEquals(inv_req, false);

        boolean cre_inc = dtActions.findDTActiveStatus(actions_1,one.driver,"Create Incident");
        Assert.assertEquals(cre_inc, false);

//address verification and validation

        synchronized (one.driver) { one.driver.wait(4000); }

        address_detail.click_address_details_tab(wb,one.driver).click();

        synchronized (one.driver) { one.driver.wait(3000); }
        String c_a=address_detail.current_address(wb,one.driver,3,1,10).getText();
        System.out.println(c_a);
        Assert.assertEquals(c_a,"NO. 2, 1ST FLOOR, PLOT NO 10, LAKSHMI STREET, UMA NAGAR, NEW PERUNGALATHUR, CHENNAI");

        synchronized (one.driver) {one.driver.wait(3000);}

//show selectors(incident,return,replacement,refund,service,callback)

        //click on show selector
        synchronized (one.driver) {one.driver.wait(3000);}
        selector_Order_non_0rder_related.show_selectors(one.wb, one.driver, 2, 85, 1).click();
        synchronized (one.driver) {one.driver.wait(5000);}


        //number of incidents
        try {
            boolean sel_incident=selector_Order_non_0rder_related.incidents(one.wb, one.driver, 2, 96, 1).isEnabled();
            if(sel_incident==true)
                System.out.println("incident count button is active"); }
        catch (Exception e) { System.out.println(e + " incident count button isn't active"); }

        synchronized (one.driver) {one.driver.wait(1000);}

        //number of returns
        try {
            boolean sel_returns=selector_Order_non_0rder_related.returns(one.wb, one.driver, 2, 97, 1).isEnabled();
            if(sel_returns==true)
                System.out.println("returns count button is active"); }
        catch (Exception e) { System.out.println(e + " returns count button isn't active"); }

        synchronized (one.driver) {one.driver.wait(1000);}

        //number of replacement
        try {
            boolean sel_replacement=selector_Order_non_0rder_related.replacement(one.wb, one.driver, 2, 98, 1).isEnabled();
            if(sel_replacement==true)
                System.out.println("replacement count button is active"); }
        catch (Exception e) { System.out.println(e + " replacement count button isn't active"); }

        synchronized (one.driver) {one.driver.wait(1000);}

        //number of refund
        try {
            boolean sel_refund=selector_Order_non_0rder_related.refund(one.wb, one.driver, 2, 99, 1).isEnabled();
            if(sel_refund==true)
                System.out.println("refund count button is active"); }
        catch (Exception e) { System.out.println(e + " refund count button isn't active"); }

        synchronized (one.driver) {one.driver.wait(1000);}

        //number of services
        try {
            boolean sel_services=selector_Order_non_0rder_related.services(one.wb, one.driver, 2, 100, 1).isEnabled();
            if(sel_services==true)
                System.out.println("services count button is active"); }
        catch (Exception e) { System.out.println(e + " services count button isn't active"); }

        synchronized (one.driver) {one.driver.wait(1000);}

        //number of callback
        try {
            boolean sel_callback=selector_Order_non_0rder_related.callback(one.wb, one.driver, 2, 101, 1).isEnabled();
            if(sel_callback==true)
                System.out.println("callback count button is active"); }
        catch (Exception e) { System.out.println(e + " callback count button isn't active"); }


            //close session
        synchronized (one.driver) {one.driver.wait(4000);}
        discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();
    }

    @Test(priority=2,enabled=false,groups="three")
    public void  ndr()throws InterruptedException,IOException {

        //click on new session
        call_to_customer.new_session(one.wb,one.driver).click();
        synchronized (one.driver) { one.driver.wait(4000); }

        //search for order id
        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
        synchronized (one.driver) { one.driver.wait(6000); }
        searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 1, 1, 2));

        searchBox.sendKeys(Keys.RETURN);
        synchronized (one.driver) { one.driver.wait(8000); }

        //name,phone,email,account id

        //order details
        //payment details
        //address
        //payment history
        //dt verification
        //show selectors(incident,return,replacement,refund,service,callback)
        //hide selectors

    }

    @Test(priority=3,enabled=false,groups="three")
    public void  r_efund()throws InterruptedException
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
    @Test(priority=4,enabled=false,groups="three")
    public void  a_BB()throws InterruptedException
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
    @Test(priority=5,enabled=false,groups="three")
    public void  e_code()throws InterruptedException
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
    @Test(priority=6,enabled=false,groups="three")
    public void  a_DLD()throws InterruptedException
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
    @Test(priority=7,enabled=false,groups="three")
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
    @Test(priority=8,enabled=false,groups="three")
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
    @Test(priority=9,enabled=false,groups="three")
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
    @Test(priority=10,enabled=false,groups="three")
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
    @Test(priority=11,enabled=false,groups="three")
    public void  Drop_ship()throws InterruptedException
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
    @Test(priority=12,enabled=false,groups="three")
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

    @AfterTest(enabled=false,groups="three")
    public void close_and_quit()throws InterruptedException {
        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }

}
