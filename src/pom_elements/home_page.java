package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class home_page {

    public static String yoda_url="http://10.85.52.152/flipkart/#/yoda";

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static List<WebElement> yoda_notifications(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]"));
        return elements;
    }

    public static WebElement yoda_noti(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(44).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement count(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(45).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement proceed_to_sa(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(46).getCell(1).getStringCellValue()));
        return element;
    }
}
