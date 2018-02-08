package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class login_page {

    public static String sa_url = "http://10.85.52.152/flipkart/";
    public static String username="rahul.kant";
    public static String pass="Rahul@12345";
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
    public static WebElement verify_me(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[3]/button"));
        return element;
    }
    public static WebElement password(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//INPUT[@type='password']"));
        return element;
    }
    public static WebElement login_button(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[4]/button[1]"));
        return element;
    }
    public static WebElement logout_previous(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/button"));
        return element;
    }
    public static WebElement profile_menu(WebDriver driver)
    {
        element=driver.findElement(By.xpath("(//I[@class='fa fa-caret-down'])[2]"));
        return element;
    }
    public static WebElement click_on_logout(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='node_modules-fk-cs-dropdown-dropdown_options'][text()='Logout']"));
        return element;
    }

}
