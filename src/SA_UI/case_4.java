package SA_UI;

import javafx.scene.layout.Priority;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pom_elements.login_page;

// Supermart (groceries) test cases
public class case_4
{
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    public login_page lp = new login_page();
    Alert alert;

    @Test(priority=1)
    public void order_details() throws InterruptedException {
    }

    @Test(priority=2)
    public void address_details() throws InterruptedException {
    }

    @Test(priority=3)
    public void payment_details() throws InterruptedException {
    }

    @Test(priority=4)
    public void toa_hiostory() throws InterruptedException {
    }



}
