package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
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
        synchronized (one.driver) { one.driver.wait(12000); }
    }

    @Test(priority=1,enabled=true,groups="three")
    public void  cash_back()  throws InterruptedException
    {
        //OD109423037514652000

            //click on new session

           try
           {
               call_to_customer.new_session(one.wb,one.driver).click();
               synchronized (one.driver) { one.driver.wait(4000); }
           }
           catch (Exception e){System.out.println(e+"  because of this issue new session button is not clickable");
           }


            //search for order id
            WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
            synchronized (one.driver) { one.driver.wait(6000); }

            searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 1, 3, 1));

            searchBox.sendKeys(Keys.RETURN);
            synchronized (one.driver) { one.driver.wait(8000); }

            //name
        try {
            String user_name = discovery_and_authentication.name(one.wb, one.driver, 3, 1, 2).getText();
            System.out.println(user_name);
            Assert.assertEquals("Ramki", user_name);
            }
            catch (Exception e)
            {System.out.println(e+ "     User name didn't match for cash_back"); e.printStackTrace();}

            //phone
        try {
            String phone_no = discovery_and_authentication.phone(one.wb, one.driver, 3, 1, 3).getText();
            System.out.println(phone_no + "is the phone number");
            Assert.assertEquals("+919003276122", phone_no);
            }
            catch (Exception e){System.out.println(e+    "  Phone number didn't match for cash_back");e.printStackTrace();}

            //email
        try {
            String email_id = discovery_and_authentication.email(one.wb, one.driver, 3, 1, 4).getText();
            System.out.println(email_id + "is the email id");
            Assert.assertEquals(email_id, "ramki221994@gmail.com");
            }
            catch (Exception e){System.out.println(e+"  email id didn't match for cash_back");e.printStackTrace();}

            //account id
        try {
             String account_id = discovery_and_authentication.account_id(one.wb, one.driver, 3, 1, 5).getText();
             System.out.println(account_id + "account id is verified");
             Assert.assertEquals(account_id, "ACC14074063501296331");
            }
            catch (Exception e){System.out.println(e+  "  account id didn't match for cash_back");e.printStackTrace();}

            //order details verification

            //order date verification
            try
            {
                String ordered_on = order_details.ordered_on(wb, one.driver,3,1,6).getText();
                System.out.println(ordered_on + "    date is verified ");
                Assert.assertEquals("13 Jun 17, 11:01 PM", ordered_on);
            }
            catch (Exception e){System.out.println(e+  "  order date verification didn't match for cash_back ");e.printStackTrace();}

             //total price verification
            try
            {
                String tp = order_details.total_price(wb, one.driver,3,1,7).getText();
                System.out.println(tp + "  total price is verified");
                Assert.assertEquals("699", tp);
            }
            catch (Exception e){System.out.println(e   +" total price verification failed for cash_back");e.printStackTrace();}

             //channel name verification
            try
            {
                String cv = order_details.channel(wb, one.driver,3,1,8).getText();
                System.out.println(cv + "  is the name of the channel");
                Assert.assertEquals("AndroidApp", cv);
            }
            catch (Exception e){System.out.println(e   +"channel name verification failed for cash_back");e.printStackTrace();}

        /* Don't remove this wait */
        synchronized (one.driver) {one.driver.wait(5000); }

        //Getting DT Actions
        List<WebElement> actions = order_details.order_verification_dt(wb, one.driver);

        //order verification dt enable check (email profile)
        try
        {
            boolean ov_dt = dtActions.findDTActiveStatus(actions,one.driver,"Order Verification");
            Assert.assertEquals(ov_dt, false);
        }
        catch (Exception e){System.out.println(e + " order verification failed for for cash_back ");e.printStackTrace();}

        //create incident dt verification enable check(email profile)
        try
        {
            boolean ci_dt =  dtActions.findDTActiveStatus(actions,one.driver,"Create Incident");
            Assert.assertEquals(ci_dt, false);
        }
        catch (Exception e){System.out.println(e +" create incident DT verification failed ");e.printStackTrace();}

        //Price adjustment dt enable check(email profile)
        try
        {
            boolean pa_dt = dtActions.findDTActiveStatus(actions,one.driver,"Price Adjustment");
            Assert.assertEquals(pa_dt, false);
        }
        catch (Exception e){System.out.println(e+  " price adjustment DT verification failed ");e.printStackTrace();}


//payment details tab verification

        //Click on payment details tab
        try
        {
            synchronized (one.driver) {one.driver.wait(8000);}
            payment_details.payment_details_tab(wb,one.driver).click();
        }
        catch (Exception e){System.out.println(e+  "  payment details verification failed");e.printStackTrace();}

        //Selling price verification
        try {
            String s_price = payment_details.selling_price(wb, one.driver, 3, 1, 9).getText();
            Assert.assertEquals("699", s_price);
        }
        catch (Exception e){System.out.println(e+ "  selling price verification failed");e.printStackTrace();}

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

        //hide selectors
        synchronized (one.driver) {one.driver.wait(3000);}
        selector_Order_non_0rder_related.hide_selectors(one.wb, one.driver, 2, 102, 1).click();


        //click on Order details tab again  (Very important flow of the case)
        synchronized (one.driver) {one.driver.wait(4000);}
        order_details.order_detail_tab_click(one.wb, one.driver, 2, 104, 1).click();

        // click on the item to go to item detail section
        synchronized (one.driver) {one.driver.wait(6000);}
        item_detail.cash_back_item_to_go_to_item_detail_tab(one.wb, one.driver, 2, 103, 1).click();

        // Logic for all the DT's under item details Tab.

        sh= wb.getSheetAt(2);
        String xpath=sh.getRow(109).getCell(1).getStringCellValue();

        WebElement element = one.driver.findElement(By.xpath(xpath));
        List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
        synchronized (one.driver){ one.driver.wait(3000); }
        int notifySize = elements.size();
        System.out.println(notifySize + " DT's are available under item detail tab, shown in the UI");

//Item details DT's enable and disable check (For email profile all the DT's should be disabled

        List<WebElement> actions_2 = item_detail.item_detail_all_DT(wb, one.driver);

        //cancel DT enable/disable check
        boolean cancel_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Cancel");
        Assert.assertEquals(cancel_dt, false);
        //Customer Return V1 enable/disable check
        boolean Customer_Return_V1_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Customer Return V1");
        Assert.assertEquals(Customer_Return_V1_dt, false);
        //Customer Return enable/disable check
        boolean Customer_Return_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Customer Return");
        Assert.assertEquals(Customer_Return_dt, false);
        //Delivery Related  DT's enable disable check
        boolean Delivery_Related_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Delivery Related");
        Assert.assertEquals(Delivery_Related_dt, false);
        //Create Incident DT's enable disable check
        boolean Create_Incident_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Create Incident");
        Assert.assertEquals(Create_Incident_dt, false);
        //Post Delivery Issues  DT's enable disable check
        boolean Post_Delivery_Issues_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Post Delivery Issues");
        Assert.assertEquals(Post_Delivery_Issues_dt, false);
        //Schedule Delivery DT's enable disable check
        boolean Schedule_Delivery_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Schedule Delivery");
        Assert.assertEquals(Schedule_Delivery_dt, false);
        //Subscribe DT's enable disable check
        boolean Subscribe_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Subscribe");
        Assert.assertEquals(Subscribe_dt, false);
        //Unsubscribe DT's enable disable check
        boolean Unsubscribe_dt = dtActions.findDTActiveStatus(actions_2,one.driver,"Unsubscribe");
        Assert.assertEquals(Unsubscribe_dt, false);


//Logistic details

        //click on Logistics details tab
        synchronized (one.driver) {one.driver.wait(5000);}
        logistics_detail.logistics_detail_tab(one.wb, one.driver, 2, 106, 1).click();

        //DT's verification under logistics Tab
        sh= wb.getSheetAt(2);
        String xpath_1=sh.getRow(110).getCell(1).getStringCellValue();

        WebElement element_logistics = one.driver.findElement(By.xpath(xpath_1));
        List<WebElement> elements_1 = element_logistics.findElements(By.xpath(".//DIV"));
        synchronized (one.driver){ one.driver.wait(3000); }
        int notifySize_1 = elements_1.size();
        System.out.println(notifySize_1 + " DT's are available under logistics detail tab, shown in the UI");

        //Seller details

        //Offer details


        //click on close session
          synchronized (one.driver) {one.driver.wait(4000);}
     //   discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();

    }

    @Test(priority=2,enabled=false,groups="three")
    public void  ndr()throws InterruptedException,IOException {

        //click on new session
        call_to_customer.new_session(one.wb,one.driver).click();
        synchronized (one.driver) { one.driver.wait(4000); }

        //search for order id
        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
        synchronized (one.driver) { one.driver.wait(6000); }
        searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 1, 1, 4));

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
        //Item details

        //Logistic details

        //Seller details

        //Offer details

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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
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
        //Item details

        //Logistic details

        //Seller details

        //Offer details
    }

    @AfterTest(enabled=false,groups="three")
    public void close_and_quit()throws InterruptedException {
        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }

}
