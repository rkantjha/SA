package pom_elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class blackbuck_login {

    public static WebElement element = null;
    public static XSSFSheet sh;


    public static String site_URL(XSSFWorkbook wb, int sheet, int row, int column) {
        sh = wb.getSheetAt(sheet);
        String  element = sh.getRow(row).getCell(column).getStringCellValue();
        return element;
    }

    public static String user_name(XSSFWorkbook wb, int sheet, int row, int column) {
        sh = wb.getSheetAt(sheet);
        String  element = sh.getRow(row).getCell(column).getStringCellValue();
        return element;
    }

    public static String user_password(XSSFWorkbook wb, int sheet, int row, int column) {
        sh = wb.getSheetAt(sheet);
        String  element = sh.getRow(row).getCell(column).getStringCellValue();
        return element;
    }

    public static String sign_in_button(XSSFWorkbook wb, int sheet, int row, int column) {
        sh = wb.getSheetAt(sheet);
        String  element = sh.getRow(row).getCell(column).getStringCellValue();
        return element;
    }


}
