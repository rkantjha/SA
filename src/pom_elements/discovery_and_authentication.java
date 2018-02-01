package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class discovery_and_authentication {

    public static WebElement  element =null;
    public static String order_id_1="OD111401472227234000";//incident,return,replacement
    public static String order_id_2="OD111401472227234000";//services
    public static String order_id_3="OD110285698905463000";//refund
    public static String account_id="ACC13518860262177453";//refund

    public static WebElement search_box(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//INPUT[@type='text']"));
        return element;
    }
    public static WebElement name(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='_-fk-cs-components-packages-sa-widgets-core-CurrentIssue-CurrentIssue_userName'][text()='Vivek keshri']"));
        return element;
    }
    public static WebElement phone(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement email(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement orders_id(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement incident_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement returns_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement replacement_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement account_id(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@title='Customer Id'][text()='ACC13518860262177453']"));
        return element;
    }



}
