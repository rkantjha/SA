package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class address_detail {
    public static WebElement element=null;
    public static XSSFSheet sh;

    public static List<WebElement> address_verification_dt(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        WebElement element = driver.findElement(By.xpath(sh.getRow(69).getCell(1).getStringCellValue()));
        List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
        return elements;
    }

    public static WebElement current_address(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(63).getCell(1).getStringCellValue()));
        return element;
    }

    public static WebElement click_address_details_tab(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(66).getCell(1).getStringCellValue()));
        return element;
    }

}
