package SA_UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.home_page;
import pom_elements.login_page;
import pom_elements.call_to_customer;
import static com.sun.tools.corba.se.idl.constExpr.Expression.two;
import static pom_elements.home_page.count;
import static pom_elements.home_page.element;
import static pom_elements.home_page.yoda_url;
import java.io.IOException;
import java.util.List;
import java.util.SplittableRandom;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import SA_UI.ExcelData;

public class case_1 {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    public login_page lp = new login_page();
    Alert alert;

    ExcelData ExcelData = new ExcelData();
    XSSFWorkbook wb = ExcelData.bootstrap();

    public case_1() throws IOException {
    }

    @BeforeTest
    public static void start(){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }

    @Test(priority=1,enabled=true)
    public void login() throws InterruptedException {
        driver.get(login_page.sa_url);

        synchronized (driver){ driver.wait(3000); }

        driver.manage().window().maximize();

        login_page.user_name(wb,driver).sendKeys(login_page.getUserName(wb));

        login_page.verify_me(wb,driver).click();

        synchronized (driver){ driver.wait(3000); }

        login_page.password(wb,driver).sendKeys(login_page.getPassword(wb));

        login_page.login_button(wb,driver).click();

        synchronized (driver){ driver.wait(3000); }

        login_page.logout_previous(wb,driver).click();

        login_page.login_button(wb,driver).click();
    }
    @Test(priority=2,enabled=true)
    public void  notification_home_page()throws InterruptedException {

            System.out.println(driver.getCurrentUrl() + "URL till here");

            if (driver.getCurrentUrl().equalsIgnoreCase(yoda_url)) {
                String notification_count =  home_page.count(wb,driver).getAttribute("innerHTML");
                System.out.println("total count is  " + notification_count);

                List<WebElement> elements = home_page.yoda_notifications(driver);
                int count = Integer.parseInt(notification_count);

                for(int i=0;i<count;i++) {
                    System.out.println("Printing Element " + i);
                    home_page.yoda_noti(wb,driver).click();
                    elements.get(i).click();
                }
                home_page.proceed_to_sa(wb,driver).click();
            }
            else {
                System.out.println("No check for notifications needed");
            }
    }
    @Test(priority = 3,enabled=false)//enable it true when test is running with voice profile
    public void call_to_customer()throws InterruptedException {
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.new_session(wb,driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.call_drop_down(wb,driver).click();
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.select_campaign(wb,driver).click();
        call_to_customer.enter_extension(wb,driver).sendKeys(call_to_customer.extension);
        call_to_customer.call_login(wb,driver).click();
        synchronized (driver){ driver.wait(6000); }
        call_to_customer.assign_yes(wb,driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.manual_dial(wb,driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.make_call(wb,driver).click();
        call_to_customer.select_number_type(wb,driver).click();
        call_to_customer.select_customer(wb,driver).click();
        call_to_customer.enter_phone_number(wb,driver).sendKeys(call_to_customer.phone_number);
        call_to_customer.click_on_dial(wb,driver).click();
    }
    @Test(priority=4,enabled=true)
    public void logout()throws InterruptedException
    {
        synchronized (driver){ driver.wait(3000); }
        login_page.profile_menu(wb,driver).click();
        synchronized (driver){ driver.wait(3000); }
        login_page.click_on_logout(wb,driver).click();
        driver.close();
        driver.quit();


    }
}
