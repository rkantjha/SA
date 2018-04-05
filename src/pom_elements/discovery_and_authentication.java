package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class discovery_and_authentication {

    public static WebElement  element =null;
    public static XSSFSheet sh;
    public static String order_id_1 ="OD111401472227234000";//incident,return,replacement
    public static String order_id_2="OD110139291489831000";//grocery
    public static String order_id_3="OD110285698905463000";//refund
    public static String account_id="ACC13518860262177453";//refund
    public static WebElement search_box;


    public static WebElement search_box(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(20).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement name(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement phone(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement email(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement orders_id(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(24).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement account_id(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement payment_button(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(26).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement cart_button(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(27).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement complete_session(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(28).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement home(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(29).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement yoda(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(30).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement back_to_discovery(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(31).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement session_navigator(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(32).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement excalate_issue(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(33).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement take_a_break(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(34).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement show_selector(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(35).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement profile_button(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(36).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement logged_in_user_name(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(37).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement account(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(38).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement change_password(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(39).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement click_on_logout(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(40).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement assign_yes(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(41).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement break_dis(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(42).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement assign_to_no(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(43).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement close_session(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
}

