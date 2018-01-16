package SA_UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.home_page;
import pom_elements.login_page;

import static pom_elements.home_page.yoda_url;
import static pom_elements.login_page.pass;
import static pom_elements.login_page.username;


public class case_1 {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    login_page lp = new login_page();
    Alert alert;


    @BeforeTest
    public static void start(){
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
    }

    @Test(priority=1,alwaysRun = true)
    public void login() throws InterruptedException
    {
        driver.get(login_page.sa_url);
        login_page.user_name(driver).sendKeys(username);
        login_page.verify_me(driver).click();
        login_page.password(driver).sendKeys(pass);
        login_page.login_button(driver).click();
        login_page.logout_previous(driver).click();
        login_page.login_button(driver).click();
    }
    @Test(priority=2,alwaysRun = true)
    public void notification_home_page()throws InterruptedException
    {
            String y_url=driver.getCurrentUrl();
            if(y_url==yoda_url)
            {
                home_page.yoda_notifications_1(driver).click();
                home_page.yoda_notification_2(driver).click();
                home_page.yoda_notifications_3(driver).click();
                home_page.yoda_notifications_4(driver).click();
                home_page.yoda_notifications_5(driver).click();
                home_page.yoda_notifications_6(driver).click();
                home_page.yoda_notifications_7(driver).click();
                home_page.yoda_notifications_8(driver).click();
                home_page.yoda_notifications_9(driver).click();
                home_page.yoda_notifications_10(driver).click();
                home_page.yoda_notifications_11(driver).click();
                home_page.yoda_notifications_12(driver).click();
                home_page.yoda_notifications_13(driver).click();
                home_page.yoda_notification_14(driver).click();
                home_page.yoda_notifications_15(driver).click();
                home_page.yoda_notifications_16(driver).click();
                home_page.yoda_notifications_17(driver).click();
                home_page.yoda_notifications_18(driver).click();
                home_page.yoda_notifications_19(driver).click();
                home_page.yoda_notifications_20(driver).click();
            }else
            {
                System.out.println("No check for notifications needed");
            }

    }
    



}
