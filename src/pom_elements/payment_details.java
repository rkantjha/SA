package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;



public class payment_details {

    public static XSSFSheet sh;
    public static WebElement element=null;


    public static String current_address(XSSFWorkbook wb){
        sh= wb.getSheetAt(2);
        return sh.getRow(1).getCell(0).getStringCellValue();
    }

    public static String Address_change(XSSFWorkbook wb){
        sh= wb.getSheetAt(2);
        return sh.getRow(1).getCell(0).getStringCellValue();
    }

    public static String create_incident(XSSFWorkbook wb){
        sh= wb.getSheetAt(2);
        return sh.getRow(1).getCell(0).getStringCellValue();
    }
}
