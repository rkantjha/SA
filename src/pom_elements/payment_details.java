package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class payment_details {

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static List<WebElement> payments_details_all_DT(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        WebElement element = driver.findElement(By.xpath(sh.getRow(68).getCell(1).getStringCellValue()));
        List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
        return elements;
    }
    public static WebElement selling_price(XSSFWorkbook wb, WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement credit_method_amountType(XSSFWorkbook wb,WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(58).getCell(1).getStringCellValue()));
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
