package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class home_page {

    public static String yoda_url="http://10.85.52.152/flipkart/#/yoda";

    public static WebElement element=null;

    public static List<WebElement> yoda_notifications(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]"));
        return elements;
    }

    public static WebElement yoda_noti(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[i]"));
        return element;
    }
    public static WebElement count(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]"));
        return element;
    }
    public static WebElement proceed_to_sa(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[2]/div[2]/div"));
        return element;
    }
}
