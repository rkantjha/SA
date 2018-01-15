package SA_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.login_page;
import static pom_elements.login_page.pass;
import static pom_elements.login_page.username;


public class case_1 {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    login_page lp = new login_page();

    @BeforeTest
    public static void start(){
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");

    }

    @Test(priority = 1,alwaysRun = true)
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


}
