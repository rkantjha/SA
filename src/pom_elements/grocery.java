package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class grocery {

    public static WebElement  element =null;
    public static XSSFSheet sh;

    public static WebElement s(XSSFWorkbook wb, WebDriver driver, int sheet, int row, int column)
    {
        sh= wb.getSheetAt(sheet);
        element=driver.findElement(By.xpath(sh.getRow(20).getCell(1).getStringCellValue()));
        return element;
    }

}
