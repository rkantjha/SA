package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class call_to_customer {

    public static WebElement  element =null;
    public String extension ="3029";

    public static WebElement call_drop_down(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/span/i"));
        return element;
    }

    public static WebElement select_campaign(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div/span[2]"));
        return element;
    }

    public static WebElement enter_extension(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/input"));
        return element;
    }
    public static WebElement call_login(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[2]/div/div/div/div[3]/div/div[1]/div"));
        return element;
    }
    public static WebElement assign_yes(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div/div[3]/div[1]/div/div/div[1]"));
        return element;
    }

}
