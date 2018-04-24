package SA_UI;

import javafx.scene.layout.Priority;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.*;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Supermart (groceries) complete test cases  // Complete email widget
// OD110139291489831000

public class case_4
{
    case_1 one = new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();
    DTActions dtActions = new DTActions();

    WebDriverWait wait = new WebDriverWait(one.driver, 10);
    Alert alert;

    //method to handle exception
    public case_4() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true,groups="one")
    public void order_details()throws InterruptedException {
        one.login();
        synchronized (one.driver) {one.driver.wait(10000);}

        call_to_customer.new_session(one.wb, one.driver).click();
        synchronized (one.driver) { one.driver.wait(10000);}

        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
        searchBox.sendKeys(discovery_and_authentication.order_id_2);
        searchBox.sendKeys(Keys.RETURN);
        synchronized (one.driver) { one.driver.wait(10000);}
        String ordered_on=order_details.ordered_on(wb, one.driver,2,70,1).getText();
        System.out.println(ordered_on);
        System.out.println(ordered_on+" ordered on details");
        Assert.assertEquals("04 Sep 17, 08:39 PM",ordered_on);

        // Active,Delivered,Cancelled,Returned,Undelivered count test

        String active_count= grocery.grocery_items(one.wb, one.driver,2,71,1).getText();
        Assert.assertEquals(active_count,"0 Active");
        System.out.println(active_count);

        String delivered_count=grocery.grocery_items(one.wb,one.driver,2,72,1).getText();
        Assert.assertEquals(delivered_count,"5 Delivered");
        System.out.println(delivered_count);

        String cancelled_count=grocery.grocery_items(one.wb,one.driver,2,73,1).getText();
        Assert.assertEquals(cancelled_count,"0 Cancelled");
        System.out.println(cancelled_count);

        String returned_count=grocery.grocery_items(one.wb,one.driver,2,74,1).getText();
        Assert.assertEquals(returned_count,"0 Returned");
        System.out.println(returned_count);

        String undelivered_count=grocery.grocery_items(one.wb,one.driver,2,75,1).getText();
        Assert.assertEquals(undelivered_count,"0 Undelivered");
        System.out.println(undelivered_count);

        /* Active,Delivered,Cancelled,Returned,Undelivered count test*/

        // Basket price
        String basket_price=grocery.grocery_items(one.wb,one.driver,2,76,1).getText();
        Assert.assertEquals(basket_price,"Basket price ₹ 623");
        System.out.println(basket_price);

        //delivery charge
        String delivery_charge=grocery.grocery_items(one.wb,one.driver,2,77,1).getText();
        Assert.assertEquals(delivery_charge,"Delivery charge ₹ 50");
        System.out.println(delivery_charge);

        //total savings
        String total_savings=grocery.grocery_items(one.wb,one.driver,2,78,1).getText();
        Assert.assertEquals(total_savings,"Total savings ₹ -130");
        System.out.println(total_savings);
    }
    @Test(priority=2,enabled=true,groups="four")
    public void basket_items()throws InterruptedException {

        //All item , Active Item , cancelled item , returned item and undelivered item
        String all_item_count=grocery.basket_status_tab(one.wb,one.driver,2,79,1).getText();
        Assert.assertEquals(all_item_count,"All items (5)");
        System.out.println(all_item_count);

        String active_item_count=grocery.basket_status_tab(one.wb,one.driver,2,80,1).getText();
        Assert.assertEquals(active_item_count,"Active items (5)");
        System.out.println(active_item_count);

        String cancelled_item_count=grocery.basket_status_tab(one.wb,one.driver,2,81,1).getText();
        Assert.assertEquals(cancelled_item_count,"Cancelled items (0)");
        System.out.println(cancelled_item_count);

        String returned_item_count=grocery.basket_status_tab(one.wb,one.driver,2,82,1).getText();
        Assert.assertEquals(returned_item_count,"Returned items (0)");
        System.out.println(returned_item_count);

        String undelivered_item_count=grocery.basket_status_tab(one.wb,one.driver,2,83,1).getText();
        Assert.assertEquals(undelivered_item_count,"Undelivered items (0)");
        System.out.println(undelivered_item_count);
    }
    @Test(priority=3,enabled=true,groups="four")
    public void payment_details()throws InterruptedException {

        /* click on payment detail */
        synchronized (one.driver) { one.driver.wait(10000); }
        payment_details.payment_details_tab(wb, one.driver).click();
        synchronized (one.driver) { one.driver.wait(10000); }

        //selling price verification
        String s_price = payment_details.selling_price(wb, one.driver,2,84,1).getText();
        System.out.println(s_price + "    selling price is verified ");
        Assert.assertEquals("623", s_price);

            /* Don't remove this wait */
        synchronized (one.driver) {one.driver.wait(10000);}

        List<WebElement> actions_2 = payment_details.payments_details_all_DT(wb,one.driver);

        boolean down_inv = dtActions.findDTActiveStatus(actions_2,one.driver,"Download Invoice");
        Assert.assertEquals(down_inv, true);

        boolean payments_and_refunds = dtActions.findDTActiveStatus(actions_2,one.driver,"Payments and Refunds");
        Assert.assertEquals(payments_and_refunds, false);

        boolean inv_req = dtActions.findDTActiveStatus(actions_2,one.driver,"Invoice Request");
        Assert.assertEquals(inv_req, false);

        boolean cre_inc = dtActions.findDTActiveStatus(actions_2,one.driver,"Create Incident");
        Assert.assertEquals(cre_inc, false);
    }
    @Test(priority=4,enabled=true,groups="four")
    public void address_details()throws InterruptedException {
        synchronized (one.driver) { one.driver.wait(10000); }
        //click on address details tab
        address_detail.click_address_details_tab(wb,one.driver).click();
        synchronized (one.driver) { one.driver.wait(10000); }
        synchronized (one.driver) {one.driver.wait(10000);}

        List<WebElement> actions_2 = address_detail.address_verification_dt(wb,one.driver);

        boolean addr_chan = dtActions.findDTActiveStatus(actions_2,one.driver,"Address Change");
        Assert.assertEquals(addr_chan, false);

        boolean cre_in = dtActions.findDTActiveStatus(actions_2,one.driver,"Create Incident");
        Assert.assertEquals(addr_chan, false);
    }
    //Enable for all profiles, except email
    @Test(priority=4,enabled=true,groups="four")
    public void toa_history()throws InterruptedException {
        System.out.println("Skip for email profile");
    }
    @Test(priority=5,enabled=true,groups="four")
    public void show_selector_grocery_basket()throws InterruptedException {
        boolean show_selector;
        if (grocery.show_selectors(one.wb, one.driver, 2, 85, 1).isEnabled()) show_selector=true;
        else{
            show_selector = false;
            System.out.println("Show selector button isn't active");
        }
        synchronized (one.driver) {one.driver.wait(10000);}
        grocery.show_selectors(one.wb, one.driver,2,85,1).click();
    }
    @Test(priority=6,enabled=true,groups="four")
    public void email_widget()throws InterruptedException {
       // click on home button
        discovery_and_authentication.home(one.wb,one.driver,2,29,1).click();
        synchronized (one.driver) {one.driver.wait(5000);}

        //click on open details
        email_widget.click_on_openDetails(one.wb,one.driver,2,88,1).click();
        synchronized (one.driver) {one.driver.wait(5000);}

        Boolean email_btn;
       if (pom_elements.email_widget.email_button(one.wb, one.driver, 2,86,1).isEnabled() ) email_btn =true;
       else System.out.println("Email button is not enabled for this profile");

       //click on email button
        synchronized (one.driver) {one.driver.wait(10000);}
        email_widget.email_button(one.wb, one.driver, 2,86,1).click();
        //email reply button enable check
        synchronized (one.driver) {one.driver.wait(4000);}
        boolean email_rply;
        synchronized (one.driver) {one.driver.wait(5000);}
        if (email_widget.email_reply(one.wb, one.driver, 2,87,1).isEnabled()) email_rply=true;
        else System.out.println("email reply button is not working");
    }
    @AfterTest(enabled=true,groups="four")
    public void close_and_quit()throws InterruptedException {
        String cURL=one.driver.getCurrentUrl();
        String exp_URL= email_widget.current_url_assigned_session(one.wb, one.driver, 2,89,1).getText();
        synchronized (one.driver) {one.driver.wait(4000);}

        if (cURL==exp_URL)
        { System.out.println("No session close required"); }
        else
        synchronized (one.driver) {one.driver.wait(8000);}
        discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();
        one.driver.close();
        one.driver.quit();
    }
}