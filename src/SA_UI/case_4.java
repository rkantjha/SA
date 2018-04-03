package SA_UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pom_elements.discovery_and_authentication;


import java.io.IOException;

// Supermart (groceries) test cases
public class case_4
{
    case_1 one = new case_1();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    Alert alert;
    public case_4() throws IOException {
    }

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
    
    @Test(priority=5)
    public void show_selector() throws InterruptedException {
    }

    @Test(priority=6)
    public void basket_items() throws InterruptedException {
        //All items
        //Active items
        //cancel items
        //returned items
        //undelivered items
    }





}
