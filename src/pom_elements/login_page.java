package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {


    public static String sa_url = "http://10.85.52.152/flipkart/";
    public static String username="rahul.kant";
    public static String pass="Rahul@12345";
    public static WebElement  element =null;

    public static WebElement user_name(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/input"));
        return  element;
    }
    public static WebElement verify_me(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[3]/button"));
        return element;
    }
    public static WebElement password(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[2]/input"));
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


}
