package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class call_to_customer {

    public static WebElement  element =null;
    public static  String extension ="3051";
    public static String phone_number="8800150411";
    public static XSSFSheet sh;

    public static WebElement call_drop_down(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2) ;
        element=driver.findElement(By.xpath(sh.getRow(8).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement select_campaign(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(9).getCell(1).getStringCellValue()));
        return element;
    }

    public static WebElement enter_extension(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(10).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement call_login(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(11).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement assign_yes(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(12).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement manual_dial(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(13).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement make_call(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(14).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement select_number_type(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(15).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement select_customer(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(16).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement enter_phone_number(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(17).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement click_on_dial(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(18).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement new_session(XSSFWorkbook wb,WebDriver driver) {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(19).getCell(1).getStringCellValue()));
        return element;
    }

}
