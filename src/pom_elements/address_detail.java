package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class address_detail {
    public static WebElement element=null;
    public static XSSFSheet sh;

    public static WebElement current_address(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(63).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement address_change_dt(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(64).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement create_incident_dt(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(65).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement click_address_details_tab(XSSFWorkbook wb, WebDriver driver){
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(66).getCell(1).getStringCellValue()));
        return element;
    }

}
