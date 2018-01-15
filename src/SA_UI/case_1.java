package SA_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.login_page;

import static pom_elements.login_page.pass;
import static pom_elements.login_page.username;


public class case_1 {
    WebDriver driver = new FirefoxDriver();
    login_page lp = new login_page();

    @BeforeTest
    public static void start(){
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

    }

    @Test(priority = 1,alwaysRun = true)
    public void before_class()
    {
        driver.get(login_page.sa_url);
        login_page.user_name(driver).sendKeys(username);
        login_page.verify_me(driver).click();
        login_page.password(driver).sendKeys(pass);
        login_page.login_button(driver).click();
        
    }
}
