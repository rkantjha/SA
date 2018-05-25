package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class item_detail {

    public static WebElement element=null;
    public static XSSFSheet sh;

    public static WebElement cash_back_item_to_go_to_item_detail_tab(XSSFWorkbook wb, WebDriver driver, int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(row).getCell(column).getStringCellValue()));
        return element;
    }

    public static List<WebElement> item_detail_all_DT(XSSFWorkbook wb, WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        WebElement element = driver.findElement(By.xpath(sh.getRow(109).getCell(1).getStringCellValue()));
        List<WebElement> elements = element.findElements(By.xpath(".//DIV"));
        return elements;
    }



}
