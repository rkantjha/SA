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
        System.out.println("cashback test passed ");

    }
    @Test(priority=2,enabled=true)
    public void  ndr()throws InterruptedException
    {
        System.out.println("ndr test passed ");


    }
    @Test(priority=3,enabled=true)
    public void  ndr_large()throws InterruptedException
    {
        System.out.println("ndr_large test passed ");

    }
    @Test(priority=4,enabled=true)
    public void  grocerry()throws InterruptedException
    {
        System.out.println("grocerry test passed ");

    }
    @Test(priority=5,enabled=true)
    public void  mps()throws InterruptedException
    {
        System.out.println("mps test passed ");

    }
    @Test(priority=6,enabled=true)
    public void  doorship()throws InterruptedException
    {
        System.out.println("doorship test passed ");

    }
    @Test(priority=7,enabled=true)
    public void  delivery_installation()throws InterruptedException
    {
        System.out.println("delivery_installation test passed ");

    }
    @Test(priority=8,enabled=true)
    public void  blacklisted()throws InterruptedException
    {
        System.out.println("blacklisted test passed ");

    }
    @Test(priority=9,enabled=true)
    public void  abb()throws InterruptedException
    {
        System.out.println("abb test passed ");

    }
    @Test(priority=10,enabled=true)
    public void  ecode()throws InterruptedException
    {
        System.out.println("ecode test passed ");

    }
    @Test(priority=11,enabled=true)
    public void  adld()throws InterruptedException
    {
        System.out.println("adld test passed ");

    }
    @Test(priority=12,enabled=true)
    public void  egv()throws InterruptedException
    {
        System.out.println("egv test passed ");

    }
    @Test(priority=13,enabled=true)
    public void  non()throws InterruptedException
    {
        System.out.println("non test passed ");

    }
    @Test(priority=14,enabled=true)
    public void  associate()throws InterruptedException
    {
        System.out.println("associate test passed ");

    }
    @Test(priority=15,enabled=true)
    public void  priority()throws InterruptedException
    {
        System.out.println("priority test passed ");

    }
    @Test(priority=16,enabled=true)
    public void  f_first()throws InterruptedException
    {
        System.out.println("f_first test passed ");

    }
    @Test(priority=17,enabled=true)
    public void  ac()throws InterruptedException
    {
        System.out.println("ac test passed ");

    }
    @Test(priority=18,enabled=true)
    public void  ndd()throws InterruptedException
    {
        System.out.println("ndd test passed ");

    }
    @Test(priority=19,enabled=true)
    public void  bnpl()throws InterruptedException
    {
        System.out.println("bnpl test passed ");

    }
    @Test(priority=20,enabled=true)
    public void  multi_ps()throws InterruptedException
    {
        System.out.println("multi_ps test passed ");

    }
    @Test(priority=21,enabled=true)
    public void  no_range()throws InterruptedException
    {
        System.out.println("no_range test passed ");

    }
    @Test(priority=22,enabled=true)
    public void  service_commands()throws InterruptedException
    {
        System.out.println("service_commands test passed ");

    }
    @Test(priority=23,enabled=true)
    public void  cashback_detail()throws InterruptedException
    {
        System.out.println("cashback_detail test passed ");

    }
    @Test(priority=24,enabled=true)
    public void  doorship_and_mps()throws InterruptedException
    {
        System.out.println("doorship_and_mps test passed ");

    }

    @AfterTest(enabled = true)
    public void close_and_quit() {

        System.out.println("Quitting the session");
        one.driver.close();
        one.driver.quit();
    }

}
