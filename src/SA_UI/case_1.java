package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.login_page;

import java.io.IOException;
import java.util.List;

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

    @Test(priority=1,enabled=true,groups="one")
    public void login() throws InterruptedException {
        driver.get(login_page.sa_url);

        synchronized (driver){ driver.wait(6000); }
        driver.manage().window().maximize();
        login_page.user_name(wb,driver).sendKeys(login_page.getUserName(wb));
        login_page.verify_me(wb,driver).click();

        synchronized (driver){ driver.wait(6000); }
        login_page.password(wb,driver).sendKeys(login_page.getPassword(wb));
        login_page.login_button(wb,driver).click();

        synchronized (driver){ driver.wait(6000); }
        login_page.logout_previous(wb,driver).click();
        login_page.login_button(wb,driver).click();
    }
    @Test(priority=2,enabled=true,groups="one")
    public void  notification_home_page()throws InterruptedException {

        synchronized (driver){ driver.wait(6000); }

        String yoda_URL="http://10.85.52.152/flipkart/#/yoda";
       // String yoda_URL="http://10.85.53.223/flipkart/#/yoda";
        String c_url=driver.getCurrentUrl();

        if (c_url.equalsIgnoreCase(yoda_URL))
        {
            System.out.println(driver.getCurrentUrl() + "URL till here");
            synchronized (driver){ driver.wait(3000); }
            String yoda_class="client-container-pages-Yoda-Notifications-Notifications_notifyList";
            String xpath="//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div/div/div[2]";
            WebElement element = driver.findElement(By.xpath(xpath));
            List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
                synchronized (driver){ driver.wait(4000); }
                int notifySize = elements.size();

//                int number =notifySize;
//                String numberAsString = new Integer(number).toString();
//                int length_of_notifications= numberAsString.length();
//                System.out.println(length_of_notifications);

                System.out.println(notifySize+" notifications to be checked");

              //  String child_xpath= "//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div/div/div[2]/div[1]";

              for(int i=1;i<=notifySize;i++)
            {
                synchronized (driver){ driver.wait(4000); }
                driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div/div/div[3]/div["+i+"]")).click();
                synchronized (driver){ driver.wait(2000); }
                try {
                    WebElement modalElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[3]/div[1]"));
                    if (modalElement.isEnabled() == true) {
                        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[3]/div[1]/div[1]/span")).click();
                        synchronized (driver) {
                            driver.wait(4000);
                        }
                    }
                } catch (Exception e){
                    System.out.println("Notification checked succesfully");
                }
            }
    //            driver.wait(3000);
                String proceed_to_sa="//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div/div/div[2]/div[2]/div";
                driver.findElement(By.xpath(proceed_to_sa)).click();
        }
        else System.out.println("NO yoda checks required");
    }
    @Test(priority = 3,enabled=false,groups="one")//enable it true when running test with voice profile
    public void call_to_customer()throws InterruptedException {
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.new_session(wb,driver).click();
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.call_drop_down(wb,driver).click();
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.select_campaign(wb,driver).click();
        call_to_customer.enter_extension(wb,driver).sendKeys(call_to_customer.extension);
        call_to_customer.call_login(wb,driver).click();
        synchronized (driver){ driver.wait(6000); }
        call_to_customer.assign_yes(wb,driver).click();
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.manual_dial(wb,driver).click();
        synchronized (driver){ driver.wait(5000); }
        call_to_customer.make_call(wb,driver).click();
        call_to_customer.select_number_type(wb,driver).click();
        call_to_customer.select_customer(wb,driver).click();
        call_to_customer.enter_phone_number(wb,driver).sendKeys(call_to_customer.phone_number);
        call_to_customer.click_on_dial(wb,driver).click();
    }

    @Test(priority=4,enabled=true,groups="one")
    public void logout()throws InterruptedException
    {
        synchronized (driver){ driver.wait(10000); }
        login_page.profile_menu(wb,driver).click();
        synchronized (driver){ driver.wait(10000); }
        login_page.click_on_logout(wb,driver).click();
        driver.close();
        driver.quit();
    }
}
