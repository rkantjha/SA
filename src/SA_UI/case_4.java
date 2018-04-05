package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;
import pom_elements.grocery;
import pom_elements.order_details;


import java.io.IOException;

// Supermart (groceries) complete test cases

public class case_4
{
    case_1 one = new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();

    WebDriverWait wait = new WebDriverWait(one.driver, 20);
    Alert alert;

    public case_4() throws IOException {
    }
    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }
    @Test(priority = 1, enabled = true)
    public void order_details() throws InterruptedException {

        one.login();
        synchronized (one.driver) {one.driver.wait(6000);}

        call_to_customer.new_session(one.wb, one.driver).click();
        synchronized (one.driver) { one.driver.wait(6000);}

        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
        searchBox.sendKeys(discovery_and_authentication.order_id_2);
        searchBox.sendKeys(Keys.RETURN);
        synchronized (one.driver) { one.driver.wait(6000);}
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

        // Active,Delivered,Cancelled,Returned,Undelivered count test

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
        Assert.assertEquals(total_savings," Total savings ");
        System.out.println(total_savings);

    }
    @Test(priority=2, enabled = true)
    public void address_details() throws InterruptedException {
    }
    @Test(priority=3, enabled = true)
    public void payment_details() throws InterruptedException {
    }
    @Test(priority=4, enabled = true)
    public void toa_history() throws InterruptedException {
    }

    @Test(priority=5, enabled = true)
    public void show_selector_grocery_basket() throws InterruptedException {
    }

    @Test(priority=6, enabled = true)
    public void basket_items() throws InterruptedException {
        //All items
        //Active items
        //cancel items
        //returned items
        //undelivered items
    }

    @AfterTest(enabled = false)
    public void close_and_quit() {

        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }





}
