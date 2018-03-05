package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class order_wise {

    public static WebElement element=null;
    public static XSSFSheet sh;
    public static int x=1;
    public static int y=1;

    /*
cash back
 */
    public static WebElement cashback_o_id(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(3);
        element=driver.findElement(By.xpath(sh.getRow(53).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement cashback_name(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(54).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement cashback_phone(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(54).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement cashback_email(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(54).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement cashback_order_detail(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(54).getCell(1).getStringCellValue()));
        return element;
    }




}
