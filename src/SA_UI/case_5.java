package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom_elements.*;

import java.io.IOException;
import java.util.ArrayList;

public class case_5 {

    case_1 one = new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();
    DTActions dtActions = new DTActions();
    email_widget ew=new email_widget();
    public static XSSFSheet sh;
    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = new WebDriverWait(one.driver, 10);
    Alert alert;

    //method to handle exception
    public case_5() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true,groups="five")
    public void test_1()throws InterruptedException
        {
            /*  OD112574278527125000  Fwd: Mismatch in Service timeline attributes on Smart Assist 2.0     */

            one.login();
            synchronized (one.driver) {one.driver.wait(6000);}

            one.notification_home_page();
            synchronized (one.driver) {one.driver.wait(6000);}

            call_to_customer.new_session(one.wb, one.driver).click();
            synchronized (one.driver) { one.driver.wait(10000);}

            WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
            searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 4, 1, 0));
            searchBox.sendKeys(Keys.RETURN);
            synchronized (one.driver) { one.driver.wait(10000);}

            // Click on show selector
            synchronized (one.driver) {one.driver.wait(3000);}
            selector_Order_non_0rder_related.show_selectors(one.wb, one.driver, 2, 85, 1).click();
            //Click on services
            synchronized (one.driver) {one.driver.wait(3000);}
            selector_Order_non_0rder_related.services(one.wb, one.driver, 2, 100, 1).click();
            //Click on Incident for which the bug got reported
            sh= wb.getSheetAt(4);
            String incident_xp=sh.getRow(3).getCell(0).getStringCellValue();
            synchronized (one.driver) {one.driver.wait(2000);}
            one.driver.findElement(By.xpath(incident_xp)).click();

            // To verify Created Date UI with Created Date on Timeline

            sh= wb.getSheetAt(4);
            String created_ui=sh.getRow(5).getCell(0).getStringCellValue();
            String created_time_ui= one.driver.findElement(By.xpath(created_ui)).getText();

            sh= wb.getSheetAt(4);
            String created_timeline=sh.getRow(7).getCell(0).getStringCellValue();
            String created_time_timeline= one.driver.findElement(By.xpath(created_timeline)).getText();

            try {
             Assert.assertEquals(created_time_ui,created_time_timeline,"Created time in the UI and Timeline not matched");}
             catch (AssertionError e){
             System.out.println("\033[1;31m" + e.getMessage());
             }

            // To verify Created Activation Date UI with Activation Date on Timeline
            sh= wb.getSheetAt(4);
            String activation_ui=sh.getRow(9).getCell(0).getStringCellValue();
            String activation_time_ui= one.driver.findElement(By.xpath(activation_ui)).getText();

            sh= wb.getSheetAt(4);
            String activation_timeline=sh.getRow(11).getCell(0).getStringCellValue();
            String activation_time_timeline= one.driver.findElement(By.xpath(activation_timeline)).getText();

            try {
                Assert.assertEquals(activation_time_ui,activation_time_timeline,"Activation time in the UI and Timeline not matched");}
            catch (AssertionError e){
                System.out.println("\033[1;31m" + e.getMessage());
            }

            // To verify In progress  Date UI with In progress Date on Timeline

            sh= wb.getSheetAt(4);
            String inprogress_ui=sh.getRow(13).getCell(0).getStringCellValue();
            String inprogress_time_ui= one.driver.findElement(By.xpath(inprogress_ui)).getText();

            sh= wb.getSheetAt(4);
            String inprogress_timeline=sh.getRow(15).getCell(0).getStringCellValue();
            String inprogress_time_timeline= one.driver.findElement(By.xpath(inprogress_timeline)).getText();

            try {
                Assert.assertEquals(inprogress_time_ui,inprogress_time_timeline,"In progress time in the UI and Timeline not matched");}
            catch (AssertionError e){
                System.out.println("\033[1;31m" + e.getMessage());
            }
            //closing the session
            discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();
        }

    @Test(priority=2,enabled=true,groups="five")
    public void test_2()throws InterruptedException
    {
        /* Issue type : OD112685840786973000 : Tracking details are not updated */
        /* Order Id's used in this test case */

        //To check Yoda Notifications
        one.notification_home_page();
        synchronized (one.driver) {one.driver.wait(5000);}

        //To open new session
        call_to_customer.new_session(one.wb, one.driver).click();
        synchronized (one.driver) { one.driver.wait(8000);}

        //Search for Order ID's
        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);
        searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 4, 1, 1));
        searchBox.sendKeys(Keys.RETURN);
        synchronized (one.driver) { one.driver.wait(8000);}

        //Click on Item group from Under Order Detail tab
        sh= wb.getSheetAt(4);
        String Item_group_from_Under_Order_Detail_tab =sh.getRow(3).getCell(1).getStringCellValue();
        one.driver.findElement(By.xpath(Item_group_from_Under_Order_Detail_tab)).click();


        //click on Logistics details tab
        synchronized (one.driver) {one.driver.wait(5000);}
        logistics_detail.logistics_detail_tab(one.wb, one.driver, 2, 106, 1).click();

        //link enable check
        sh= wb.getSheetAt(4);
        String link_enable_1=sh.getRow(5).getCell(1).getStringCellValue();

       if(one.driver.findElement(By.xpath(link_enable_1)).isEnabled()==true) System.out.println("Order tracking link is enabled and working");

       else{
           System.out.println("\033[1;31m"+ " Order tracking link is disabled");
       }
       // To verify new tab after opening the link
        synchronized (one.driver) {one.driver.wait(5000);}
        one.driver.findElement(By.xpath(link_enable_1)).click();

        String windowHandle = one.driver.getWindowHandle();
        one.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList tabs = new ArrayList (one.driver.getWindowHandles());
        System.out.println(tabs.size());
        one.driver.switchTo().window((String) tabs.get(1));

        String new_tab_url_verify=one.driver.getCurrentUrl();
        System.out.println(new_tab_url_verify);

        try{
            sh= wb.getSheetAt(4);
            String url_of_new_tab_after_clicking_on_tracking_link_1=sh.getRow(7).getCell(1).getStringCellValue();

            Assert.assertEquals(new_tab_url_verify,url_of_new_tab_after_clicking_on_tracking_link_1);
        }
        catch (AssertionError error)
        {
            System.out.println("\033[1;31m" + error.getMessage());
        }

        //close the new tracking tab
        one.driver.close();

        // close the session to search for new order id
        synchronized (one.driver) {one.driver.wait(2000);}
        discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();

        //open new session
        call_to_customer.new_session(one.wb, one.driver).click();
        synchronized (one.driver) {one.driver.wait(4000);}

        //search for new order id  OD112809564412835000
        searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 4, 9, 1));
        searchBox.sendKeys(Keys.RETURN);
        synchronized (one.driver) { one.driver.wait(8000);}

        //click on item from order detail tab
        





    }

    @AfterTest(enabled=false,groups="five")
    public void close_and_quit()throws InterruptedException {
        one.driver.close();
        one.driver.quit();
    }
}
