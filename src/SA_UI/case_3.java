package SA_UI;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.address_detail;

import java.io.IOException;


public class case_3 {
    case_1 one = new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();


    public case_3() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    }

    @Test(priority=1,enabled=true)
    public void  cashback()throws InterruptedException
    {
        one.login();

    }
    @Test(priority=2,enabled=true)
    public void  ndr()throws InterruptedException
    {

    }
    @Test(priority=3,enabled=true)
    public void  ndr_large()throws InterruptedException
    {

    }
    @Test(priority=4,enabled=true)
    public void  grocerry()throws InterruptedException
    {

    }
    @Test(priority=5,enabled=true)
    public void  mps()throws InterruptedException
    {

    }
    @Test(priority=6,enabled=true)
    public void  doorship()throws InterruptedException
    {

    }
    @Test(priority=7,enabled=true)
    public void  delivery_installation()throws InterruptedException
    {

    }
    @Test(priority=8,enabled=true)
    public void  blacklisted()throws InterruptedException
    {

    }
    @Test(priority=9,enabled=true)
    public void  abb()throws InterruptedException
    {

    }
    @Test(priority=10,enabled=true)
    public void  ecode()throws InterruptedException
    {

    }
    @Test(priority=11,enabled=true)
    public void  adld()throws InterruptedException
    {

    }
    @Test(priority=12,enabled=true)
    public void  egv()throws InterruptedException
    {

    }
    @Test(priority=13,enabled=true)
    public void  non()throws InterruptedException
    {

    }
    @Test(priority=14,enabled=true)
    public void  associate()throws InterruptedException
    {

    }
    @Test(priority=15,enabled=true)
    public void  priority()throws InterruptedException
    {

    }
    @Test(priority=16,enabled=true)
    public void  f_first()throws InterruptedException
    {

    }
    @Test(priority=17,enabled=true)
    public void  ac()throws InterruptedException
    {

    }
    @Test(priority=18,enabled=true)
    public void  ndd()throws InterruptedException
    {

    }
    @Test(priority=19,enabled=true)
    public void  bnpl()throws InterruptedException
    {

    }
    @Test(priority=20,enabled=true)
    public void  multi_ps()throws InterruptedException
    {

    }
    @Test(priority=21,enabled=true)
    public void  no_range()throws InterruptedException
    {

    }
    @Test(priority=22,enabled=true)
    public void  service_commands()throws InterruptedException
    {

    }
    @Test(priority=23,enabled=true)
    public void  cashback_detail()throws InterruptedException
    {

    }
    @Test(priority=24,enabled=true)
    public void  doorship_and_mps()throws InterruptedException
    {

    }
    @AfterTest(enabled = true)
    public void close_and_quit() {

        System.out.println(" Quitting the session ");
        one.driver.close();
        one.driver.quit();
    }

}
