package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class order_details {

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static WebElement ordered_on(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement total_price(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static WebElement channel(XSSFWorkbook wb,WebDriver driver,int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }
    public static List<WebElement> order_verification_dt(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        WebElement element = driver.findElement(By.xpath(sh.getRow(50).getCell(1).getStringCellValue()));
        List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
        return elements;
    }
}
