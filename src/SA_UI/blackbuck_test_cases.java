package SA_UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pom_elements.login_page;

public class blackbuck_test_cases {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    public login_page lp = new login_page();
    Alert alert;

    ExcelData ExcelData = new ExcelData();


    @Test(priority = 1, enabled = true)
    public void bb_login() throws InterruptedException {


    }




}
