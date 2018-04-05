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
import pom_elements.order_details;


import java.io.IOException;

// Supermart (groceries) test cases

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
        Assert.assertEquals("28 Jan 18, 10:43 PM",ordered_on);





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
