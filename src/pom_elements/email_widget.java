package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class email_widget {

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static WebElement email_button(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement email_reply(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement click_on_openDetails(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement update_incident_button(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement order_id_popup(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement send_sms_button(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement popup_phone_number(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement radio_button_phone(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement popup_submit(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement popup_close(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }

}
