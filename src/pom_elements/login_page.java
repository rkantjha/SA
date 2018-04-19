package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class login_page {

    public static String sa_url = "http://10.85.52.152/flipkart/";//prod
     //public static String sa_url="http://10.85.53.223/flipkart/";//pre prod
    //public static String sa_url="http://10.85.162.142:3000/flipkart/login";


    //public static String sa_url="http://172.20.48.121:3000/flipkart/";//sathish local

    //public static String username="kr.sathish";
    //public static String pass="Sathish@1992";

    public static String username="rahul.kant";
    public static String pass="Rahul@12345";

    //public static String username="vidya.reddy";
    //public static String pass="Flipkart@123";

    public static WebElement  element =null;
    public static XSSFSheet sh;

    public static String getUserName(XSSFWorkbook wb){
        sh= wb.getSheetAt(0);
        return sh.getRow(1).getCell(0).getStringCellValue();
    }

    public static String getPassword(XSSFWorkbook wb){
        sh= wb.getSheetAt(0);
        return sh.getRow(1).getCell(1).getStringCellValue();
    }

    public static WebElement user_name(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(1).getCell(1).getStringCellValue()));
        return element;

    }
    public static WebElement verify_me(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(2).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement password(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(3).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement login_button(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(4).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement logout_previous(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(5).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement profile_menu(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(6).getCell(1).getStringCellValue()));
        return element;
    }
    public static WebElement click_on_logout(XSSFWorkbook wb,WebDriver driver)
    {
        sh= wb.getSheetAt(2);
        element=driver.findElement(By.xpath(sh.getRow(7).getCell(1).getStringCellValue()));
        return element;
    }

}
