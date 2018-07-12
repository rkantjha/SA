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
            /*  OD112574278527125000         Fwd: Mismatch in Service timeline attributes on Smart Assist 2.0     */

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
            String activation_ui=sh.getRow(5).getCell(0).getStringCellValue();
            String activation_time_ui= one.driver.findElement(By.xpath(created_ui)).getText();

            sh= wb.getSheetAt(4);
            String activation_timeline=sh.getRow(7).getCell(0).getStringCellValue();
            String activation_time_timeline= one.driver.findElement(By.xpath(created_timeline)).getText();

            try {
                Assert.assertEquals(activation_time_ui,activation_time_timeline,"Activation time in the UI and Timeline not matched");}
            catch (AssertionError e){
                System.out.println("\033[1;31m" + e.getMessage());
            }

            //



            //closing the session
            discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();

        }

    @AfterTest(enabled=false,groups="five")
    public void close_and_quit()throws InterruptedException {
        one.driver.close();
        one.driver.quit();
    }
}
