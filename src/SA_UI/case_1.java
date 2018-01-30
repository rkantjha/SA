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

import static pom_elements.home_page.count;
import static pom_elements.home_page.element;
import static pom_elements.home_page.yoda_url;
import static pom_elements.login_page.pass;
import static pom_elements.login_page.username;
import java.util.List;
import java.util.SplittableRandom;

public class case_1 {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    login_page lp = new login_page();
    Alert alert;

    @BeforeTest
    public static void start(){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    }
    @Test(priority=1,enabled=true)
    public void login() throws InterruptedException {
        driver.get(login_page.sa_url);
        driver.manage().window().maximize();
        login_page.user_name(driver).sendKeys(username);
        login_page.verify_me(driver).click();
        synchronized (driver){ driver.wait(3000); }
        login_page.password(driver).sendKeys(pass);
        login_page.login_button(driver).click();
        synchronized (driver){ driver.wait(3000); }
        login_page.logout_previous(driver).click();
        login_page.login_button(driver).click();
    }
    @Test(priority=2,enabled=true)
    public void  notification_home_page()throws InterruptedException {

            System.out.println(driver.getCurrentUrl() + "URL till here");

            if (driver.getCurrentUrl().equalsIgnoreCase(yoda_url)) {
                String notification_count =  home_page.count(driver).getAttribute("innerHTML");
                System.out.println("total count is  " + notification_count);

                List<WebElement> elements = home_page.yoda_notifications(driver);
                int count = Integer.parseInt(notification_count);

                for(int i = 0;i<count;i++) {
                    System.out.println("Printing Element " + i);
                    home_page.yoda_noti(driver).click();
                    elements.get(i).click();
                }
                home_page.proceed_to_sa(driver).click();
            }
            else {
                System.out.println("No check for notifications needed");
            }
    }
    @Test(priority = 3,enabled=false)
    public void call_to_customer()throws InterruptedException {
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.new_session(driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.call_drop_down(driver).click();
        call_to_customer.select_campaign(driver).click();
        call_to_customer.enter_extension(driver).sendKeys(call_to_customer.extension);
        call_to_customer.call_login(driver).click();
        call_to_customer.assign_yes(driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.manual_dial(driver).click();
        synchronized (driver){ driver.wait(3000); }
        call_to_customer.make_call(driver).click();
        call_to_customer.select_number_type(driver).click();
        call_to_customer.select_customer(driver).click();
        call_to_customer.enter_phone_number(driver).sendKeys(call_to_customer.phone_number);
        call_to_customer.click_on_dial(driver).click();
    }
}
