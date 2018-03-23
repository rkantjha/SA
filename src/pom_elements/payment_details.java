package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class payment_details {

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static WebElement selling_price(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(54).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement download_invoice(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement payments_and_refunds(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement create_incidents(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(57).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement credit_method_amountType(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(58).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement invoice_request(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(59).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement amount(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(60).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement credit_status(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(61).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement payment_details_tab(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(62).getCell(1).getStringCellValue()));
        return element;
    }

}
